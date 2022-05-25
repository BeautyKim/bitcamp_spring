package kr.readvice.api.user.repositories;

import kr.readvice.api.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

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
interface UserCustomRepository{
    @Modifying
    @Query(value = "")
    void update(User user);

    @Query(value = "")
    String login(User user);
}
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
}
