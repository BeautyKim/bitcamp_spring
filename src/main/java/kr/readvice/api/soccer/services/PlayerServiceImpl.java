package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Player;
import kr.readvice.api.soccer.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.common.soccer.services
 * fileName      : PlayerServiceImpl
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         beautyKim        최초 생성
 */
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    private final PlayerRepository repository;
    @Override
    public List<Player> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Player> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Player> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Player player) {
        repository.delete(player);
        return "";
    }

    @Override
    public String save(Player player) {
        repository.save(player);
        return "";
    }

    @Override
    public Optional<Player> findById(String playerId) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String playerId) {
        return repository.existsById(Long.valueOf(playerId));
    }

    @Override
    public Player getOne(Long playerId) {
        return null;
    }
}
