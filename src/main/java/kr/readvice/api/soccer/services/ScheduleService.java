package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.services
 * fileName      : ScheduleService
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
public interface ScheduleService {
    List<Schedule> findAll();

    List<Schedule> findAll(Sort sort);

    long count();

    String delete(Schedule schedule);

    String save(Schedule schedule);

    Optional<Schedule> findById(String scheduleId);

    Page<Schedule> findAll(Pageable pageable);

    boolean existsById(String scheduleId);

    Schedule getOne(Long scheduleId);

}
