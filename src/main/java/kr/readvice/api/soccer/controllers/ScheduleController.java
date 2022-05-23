package kr.readvice.api.soccer.controllers;

import kr.readvice.api.soccer.domains.Schedule;
import kr.readvice.api.soccer.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.controllers
 * fileName      : ScheduleController
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         beautyKim        최초 생성
 */
@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService service;

    @GetMapping("/findAll")
    public List<Schedule> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Schedule schedule) {
        return service.delete(schedule);
    }

    @PostMapping("/join")
    public String save(@RequestBody Schedule schedule) {
        return service.save(schedule);
    }

    @GetMapping("/findById/{scheduleId}")
    public Optional<Schedule> findById(@PathVariable String scheduleId) {
        return service.findById(scheduleId);
    }

    @GetMapping("/existsById/{scheduleId}")
    public boolean existsById(@PathVariable String scheduleId) {
        return service.existsById(scheduleId);
    }

    @PostMapping("/getOne/{scheduleId}")
    public Schedule getOne(@PathVariable Long scheduleId) {
        return service.getOne(scheduleId);
    }
}

