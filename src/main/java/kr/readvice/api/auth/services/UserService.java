package kr.readvice.api.auth.services;

import kr.readvice.api.auth.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * packageName   : kr.readvice.api.domains
 * fileName      : ddd
 * author        : beautyKim
 * date          : 2022-05-13
 * desc          : custom
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04         2022-05-04        최초 생성
 */
public interface UserService {

    String login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    String update(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    // custom

    List<User> findByUserName(String name);


}