package kr.readvice.api.soccer.repositories;

import kr.readvice.api.soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName   : kr.readvice.api.common.soccer.repositories
 * fileName      : ScheduleRepository
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
interface ScheduleCustomRepository{

}
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
