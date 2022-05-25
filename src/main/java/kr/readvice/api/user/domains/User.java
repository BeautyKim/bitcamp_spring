package kr.readvice.api.user.domains;
import com.sun.istack.NotNull;
import kr.readvice.api.board.domains.Article;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName   : kr.readvice.api.domains
 * fileName      : User
 * author        : beautyKim
 * date          : 2022-05-18
 * desc          : User, Article 1:N 양방향 관계 설정
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03         2022-05-03        최초 생성
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;

    @OneToMany(mappedBy = "user")
    List<Article> a = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;
}