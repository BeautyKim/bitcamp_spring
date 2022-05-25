package kr.readvice.api.auth.domains;

import io.jsonwebtoken.*;
import lombok.extern.java.Log;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName   : kr.readvice.api.security.domains
 * fileName      : SecurityToken
 * author        : beautyKim
 * date          : 2022-05-23
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-23         beautyKim       최초 생성
 */
@Log
public class AuthToken {
    private String token;
    private String key;

    public AuthToken(String key) {
        this.key = key;
        this.token = createToken();
    }

    private String createToken() {
        try{
            Map<String, Object> headers = new HashMap<>();
            headers.put("typ","JWT");
            headers.put("alg","HS256");
            Map<String, Object> payload = new HashMap<>();
            headers.put("data","blahblah");
            Date ext = new Date();
            ext.setTime(ext.getTime() + 1000 * 6L * 2L);
            return Jwts.builder()
                    .setHeader(headers)
                    .setSubject("user")
                    .setExpiration(ext)
                    .signWith(SignatureAlgorithm.HS256, key.getBytes())
                    .compact();
        }
        catch (SecurityException e){log.info("");}
        catch (MalformedJwtException e){log.info("");}
        catch (ExpiredJwtException e){log.info("");}
        catch (UnsupportedJwtException e){log.info("");}
        catch (IllegalAccessError e){log.info("");}
        return null;
    }
}
