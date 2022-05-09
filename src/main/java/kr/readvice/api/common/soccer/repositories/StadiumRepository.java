package kr.readvice.api.common.soccer.repositories;

import kr.readvice.api.common.soccer.domains.Player;
import kr.readvice.api.common.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName   : kr.readvice.api.common.soccer.repositories
 * fileName      : StadiumRepository
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
