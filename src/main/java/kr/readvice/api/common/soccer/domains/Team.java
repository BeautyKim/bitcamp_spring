package kr.readvice.api.common.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.common.soccer.domains
 * fileName      : Team
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
@Table(name = "teams")
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String orig;
    private String stadiumId;
    private String zipcode1;
    private String zipcode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;
}
