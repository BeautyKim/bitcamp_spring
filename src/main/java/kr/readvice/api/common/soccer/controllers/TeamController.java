package kr.readvice.api.common.soccer.controllers;

import kr.readvice.api.common.soccer.domains.Team;
import kr.readvice.api.common.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.controllers
 * fileName      : TeamController
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {
    private final TeamService service;
    
    @GetMapping("/findAll")
    public List<Team> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<Team> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Team> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Team player) {
        return service.delete(player);
    }


    @GetMapping("/findById/{teamId}")
    public Optional<Team> findById(@PathVariable String playerid) {
        return service.findById(playerid);
    }

    @GetMapping("/existsById/{teamId}")
    public boolean existsById(@PathVariable String playerid) {
        return service.existsById(playerid);
    }

    @PostMapping("/getOne/{teamId}")
    public Team getOne(@PathVariable Long teamId) {
        return service.getOne(teamId);
    }
}