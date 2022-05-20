package kr.readvice.api.common.soccer.services;

import kr.readvice.api.common.soccer.domains.Schedule;
import kr.readvice.api.common.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.services
 * fileName      : ScheduleServiceImpl
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService{
    private final ScheduleRepository repository;

    @Override
    public List<Schedule> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Schedule schedule) {
        repository.delete(schedule);
        return "";
    }

    @Override
    public String save(Schedule schedule) {
        repository.save(schedule);
        return "";
    }

    @Override
    public Optional<Schedule> findById(String scheduleId) {
        return repository.findById(0L);
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public boolean existsById(String scheduleId) {
        return repository.existsById(Long.valueOf(scheduleId));
    }

    @Override
    public Schedule getOne(Long scheduleId) {
        return null;
    }
}