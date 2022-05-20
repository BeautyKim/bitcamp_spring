package kr.readvice.api.board.domains;

import com.sun.istack.NotNull;
import kr.readvice.api.auth.domains.User;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.board
 * fileName      : Article
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          : Article, User  N:1 양방향 관계 설정
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-18         2022-05-18        최초 생성
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "articles")
public class Article {
    @Id @Column(name = "article_id")
    @GeneratedValue private long articleId;
    @Column @NotNull
    private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

}