package kr.readvice.api.soccer.repositories;

import kr.readvice.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName   : kr.readvice.api.common.soccer.repositories
 * fileName      : PlayerRepositorie
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
interface PlayerCustomRepository{

}

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
