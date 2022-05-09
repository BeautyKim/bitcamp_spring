package kr.readvice.api.auth.repositories;

import kr.readvice.api.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName   : kr.readvice.api.domains
 * fileName      : UserRepository
 * author        : beautyKim
 * date          : 2022-05-04
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04         2022-05-04        최초 생성
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void put(User user);
    String login(User user);
}
