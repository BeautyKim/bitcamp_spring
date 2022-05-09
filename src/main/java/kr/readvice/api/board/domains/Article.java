package kr.readvice.api.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.board
 * fileName      : Article
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
@Table(name = "articles")
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projects;
    private String startDate;
    private String status;
    private String team;
    private String progress;
    private String action;
}
