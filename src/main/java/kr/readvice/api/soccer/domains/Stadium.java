package kr.readvice.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "stadiums")
public class Stadium {
    @Id @Column(name = "stadium_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long stadiumNo;
    @Column(nullable = false) private String stadiumId;
    private String stadiumName;
    private String hometeamId;
    private String seatCount;
    private String address;
    private String ddd;
    private String tel;

    @OneToOne(mappedBy = "stadiums")
    private Team team;

    @OneToMany(mappedBy = "stadiums")
    List<Schedule> schedules = new ArrayList<>();
}
