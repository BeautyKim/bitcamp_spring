package kr.readvice.api.common.soccer.controllers;

import kr.readvice.api.common.soccer.domains.Schedule;
import kr.readvice.api.common.soccer.domains.Stadium;
import kr.readvice.api.common.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.controllers
 * fileName      : StadiumController
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@RestController
@RequestMapping("/stadium")
@RequiredArgsConstructor
public class StadiumController {
    private final StadiumService service;

    @GetMapping("/findAll")
    public List<Stadium> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<Stadium> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Stadium> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Stadium stadium) {
        return service.delete(stadium);
    }

    @PostMapping("/join")
    public String save(@RequestBody Stadium stadium) {
        return service.save(stadium);
    }

    @GetMapping("/findById/{stadiumId}")
    public Optional<Stadium> findById(@PathVariable String stadiumId) {
        return service.findById(stadiumId);
    }

    @GetMapping("/existsById/{stadiumId}")
    public boolean existsById(@PathVariable String stadiumId) {
        return service.existsById(stadiumId);
    }

    @PostMapping("/getOne/{stadiumId}")
    public Stadium getOne(@PathVariable Long stadiumId) {
        return service.getOne(stadiumId);
    }
}