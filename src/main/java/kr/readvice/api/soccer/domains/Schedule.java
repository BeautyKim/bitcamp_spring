package kr.readvice.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.common.soccer.domains
 * fileName      : Schedule
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
@Table(name = "schedules")
public class Schedule {
    @Id @Column(name = "Schedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleId;
    @Column(nullable = false) private String stadiumId;
    @Column(nullable = false) private String scheDate;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private String homeScore;
    private String awayScore;

    @ManyToOne
    @JoinColumn(name = "stadium_no")
    private Stadium stadiums;
}
