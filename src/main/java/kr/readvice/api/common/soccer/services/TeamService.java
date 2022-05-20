package kr.readvice.api.common.soccer.services;

import kr.readvice.api.common.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.services
 * fileName      : TeamService
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
public interface TeamService {
    List<Team> findAll();

    List<Team> findAll(Sort sort);

    Page<Team> findAll(Pageable pageable);

    long count();

    String delete(Team player);

    String save(Team player);

    Optional<Team> findById(String playerid);

    boolean existsById(String playerid);

    Team getOne(Long teamId);
}
