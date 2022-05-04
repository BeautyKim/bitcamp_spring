package kr.readvice.api.domains;
import lombok.Data;
import lombok.Generated;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName   : kr.readvice.api.domains
 * fileName      : User
 * author        : beautyKim
 * date          : 2022-05-03
 * desc          : class에 entity 설정
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03         2022-05-03        최초 생성
 */

@Data
@Component
@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String userid;
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private int phone;
    private int birth;
    private String address;

}
