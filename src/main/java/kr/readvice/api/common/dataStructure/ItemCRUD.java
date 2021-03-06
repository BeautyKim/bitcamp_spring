package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

/**
 * packageName   : kr.readvice.api.common.dataStructure
 * fileName      : ItemCRUD
 * author        : beautyKim
 * date          : 2022-05-10
 * desc          : 스프링 컴포넌트 스캔
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-10         2022-05-10        최초 생성
 */
public class ItemCRUD {
    public static void main(String[] args){
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
    @Data @AllArgsConstructor static class Item{
        private int id;
        private String name;
        private int price;
    }
    interface ItemService{
        void save(Item item);
    }
    @RequiredArgsConstructor
    class ItemServiceImpl implements ItemService{
        @Override
        public void save(Item item) {

        }
    }
}
