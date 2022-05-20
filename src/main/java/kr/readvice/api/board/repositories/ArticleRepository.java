package kr.readvice.api.board.repositories;

import kr.readvice.api.board.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * packageName   : kr.readvice.api.board.repositories
 * fileName      : BoardRepository
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
