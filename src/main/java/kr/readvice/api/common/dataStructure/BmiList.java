package kr.readvice.api.common.dataStructure;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName   : kr.readvice.api.common.dataStructure
 * fileName      : BmiList
 * author        : beautyKim
 * date          : 2022-05-11
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         2022-05-11        최초 생성
 */
//키 height 몸무게 weight 생년월일 ssn (990101-1) 성별 gender
public class BmiList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MemberCRUD.MemberService service = new MemberCRUD.MemberServiceImpl();
        while (true) {
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findByAll 7.count 8.existsById 9.clear");
            switch (s.next()) {
                case "0":
                    return;
                case "1":
                    MemberCRUD.Member kim = new MemberCRUD.Member.Builder("kim")
                            .email("readviceKim@naver.com")
                            .password("1")
                            .name("beautyKim")
                            .phone("010-1111-2222")
                            .profileImg("kim.png")
                            .build();
                    service.save(kim);
                    MemberCRUD.Member hong = new MemberCRUD.Member.Builder("hong")
                            .email("readviceHong@naver.com")
                            .password("2")
                            .name("honghong")
                            .phone("010-3333-4444")
                            .profileImg("hong.png")
                            .build();
                    service.save(hong);
                    System.out.println("저장완료~~");
                    break;
                case "2":
                    //service.update();
                    break;
                case "3":
                    MemberCRUD.Member temp = new MemberCRUD.Member();
                    temp.setUserid(s.next());
                    service.delete(temp);
                    break;
                case "4":
                    System.out.println("아이디 입력하세욥");
                    if (service.existsById(s.next())) {
                        System.out.println(service.findById("kim"));
                    } else {
                        System.out.println("존재하지 않는 아이디 입니다");
                    }
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("총 회원목록 : " + service.findAll());
                    break;
                case "7":
                    System.out.println("총 회원수 : " + service.count() + "명");
                    break;
                case "8":
                    break;
                case "9":
                    break;
                default:
                    break;
            }

        }

    }
    @Data static class Bmi{
        private double height, weight;
        private String ssn, gender;
    }
    interface BmiService{
        void save(Bmi bmi);
        void update(int i, Bmi bmi);
        void delete(Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findByGender(String gender);
        Bmi findById(int i);
        int count();
    }
    static class BmiServiceImpl implements BmiService{
        private final List<Bmi> list;

        public BmiServiceImpl() { this.list = new ArrayList<>();
        }

        @Override
        public void save(Bmi bmi) {list.add(bmi);}

        @Override
        public void update(int i, Bmi bmi) {list.set(i, bmi); }

        @Override
        public void delete(Bmi bmi) {list.remove(bmi); }

        @Override
        public List<Bmi> findAll() {
            return list;
        }

        @Override
        public List<Bmi> findByGender(String gender) {
            return null;
        }

        @Override
        public Bmi findById(int i) {
            return null;
        }

        @Override
        public int count() {
            return list.size();
        }
    }

}
