package kr.readvice.api.auth.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName   : kr.readvice.api.security.domains
 * fileName      : Messenger
 * author        : beautyKim
 * date          : 2022-05-23
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-23         beautyKim       최초 생성
 */
@Getter @Builder
public class Messenger {
    private String message, code, token;
    private int status;
}
