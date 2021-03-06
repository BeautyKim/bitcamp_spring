package kr.readvice.api.user.services;

import kr.readvice.api.auth.domains.Messenger;
import kr.readvice.api.user.domains.User;
import kr.readvice.api.user.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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

    UserDTO login(UserDTO paramUser);

    Messenger  logout();

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    Messenger count();

    Messenger update(User user);

    Messenger delete(User user);

    Messenger save(UserDTO user);

    Optional<User> findById(String userid);

    Messenger existsById(String userid);

    // custom

    List<User> findByUserName(String name);


}