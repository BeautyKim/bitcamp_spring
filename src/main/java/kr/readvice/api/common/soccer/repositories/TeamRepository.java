package kr.readvice.api.common.soccer.repositories;

import kr.readvice.api.common.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName   : kr.readvice.api.common.soccer.repositories
 * fileName      : TeamRepository
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
interface TeamCustomRepository{
    // 000. 팀의 전화번호와 팩스번호를 수정하시오.
    @Query(value = "update team t set t.tel = :tel, t.fax = :fax where t.teamNo = :teamNo",
            nativeQuery = true)
    int update(@Param("tel") String tel, @Param("fax") String fax);

    // 001. 전체 축구팀 목록을 팀이름 오름차순으로 축력하시오
    @Query(value = "select t.teamName as teamName from team t order by t.teamName",
            nativeQuery = true)
    List<String> findTeamNamesAsc();

    // 002. 플레이어의 포지션 종류를 나열하시오. 단 중복은 제거하고, 포지션이 없으면 빈공간으로 두시오.
    @Query(value = "select distinct p.position as '공백 포함 포지션' from player p", nativeQuery = true)
    List<String> findPlayerPositionAsc();

    // 003. 플레이어의 포지션 종류를 나열하시오. 단 중복은 제거하고, 포지션이 없으면 '신입' 으로 기재하시오.
    @Query(value = "select distinct if(p.position='', '신입', p.position) as '신입포함 포지션' from player p", nativeQuery = true)
    List<String> findPlayerPosition();

    // 004. 수원팀에서 골키퍼(GK)의 이름을 모두 출력하시오. 단 수원팀 ID는 K02 입니다.

}

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
