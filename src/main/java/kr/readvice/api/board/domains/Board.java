package kr.readvice.api.board.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName   : kr.readvice.api.board.domains
 * fileName      : Board
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          : Board, Article 1:N 양방향 관계 설정
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
@Eager
@Table(name = "boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private long boardId;
    @Column @NotNull
    private String boardName;
    @Column(name = "created_date") @NotNull private String writtenDate;

    @OneToMany(mappedBy = "board")
    List<Article> a = new ArrayList<>();
}
