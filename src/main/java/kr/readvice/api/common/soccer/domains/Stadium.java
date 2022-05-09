package kr.readvice.api.common.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.common.soccer.domains
 * fileName      : Stadium
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
@Table(name = "stadiums")
public class Stadium {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadiumId;
    private String stadiumName;
    private String homeTeamId;
    private String seatCount;
    private String address;
    private String ddd;
    private String tel;

}
