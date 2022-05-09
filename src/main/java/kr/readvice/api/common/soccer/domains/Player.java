package kr.readvice.api.common.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.common.soccer.domains
 * fileName      : Player
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@Data
@Component
@Entity
@Table(name = "players")
public class Player {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerId ;
    private String playerName ;
    private String teamId ;
    private String ePlayerName ;
    private String nickname ;
    private String joinYyyy ;
    private String position ;
    private String backNo ;
    private String nation ;
    private String birthDate ;
    private String solar ;
    private String height ;
    private String weight ;

}
