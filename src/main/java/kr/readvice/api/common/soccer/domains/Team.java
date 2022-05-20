package kr.readvice.api.common.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "teams")
public class Team {
    @Id @Column(name = "team_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long teamNo;
    @Column(nullable = false) private String teamId;
    @Column(nullable = false) private String stadiumId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;

    @OneToMany(mappedBy = "teams")
    List<Player> players = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "stadium_No")
    private Stadium stadiums;
}
