package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * packageName   : kr.readvice.api.common.dataStructure
 * fileName      : MemberCRUD
 * author        : beautyKim
 * date          : 2022-05-09
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         2022-05-09        최초 생성
 */
public class MemberCRUD {
    public static void main(String[] args){ //컨트롤러
        Scanner s = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while (true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findByAll 7.count 8.existsById 9.clear");
            switch (s.next()){
                case "0":return;
                case "1":
                    Member kim = new Member.Builder("kim")
                            .email("readviceKim@naver.com")
                            .password("1")
                            .name("beautyKim")
                            .phone("010-1111-2222")
                            .profileImg("kim.png")
                            .build();
                    service.save(kim);
                    Member hong = new Member.Builder("hong")
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
                    Member temp = new Member();
                    temp.setUserid(s.next());
                    service.delete(temp);
                    break;
                case "4":
                    System.out.println("아이디 입력하세욥");
                    if (service.existsById(s.next())){
                        System.out.println(service.findById("kim"));
                    }else {
                        System.out.println("존재하지 않는 아이디 입니다");
                    }
                    break;
                case "5":break;
                case "6":
                    System.out.println("총 회원목록 : " + service.findByAll());
                    break;
                case "7":
                    System.out.println("총 회원수 : "+service.count()+"명");
                    break;
                case "8":break;
                case "9":
                    break;
                default:break;
            }
        }
    }
    @Data @NoArgsConstructor static class Member{ //도메인
        protected String userid, name, password, profileImg, phone, email;
        public Member(Builder builder){
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;

        }

        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder (String userid){this.userid=userid;}
            public Builder name (String name){this.name=name; return this;}
            public Builder password (String password){this.password=password; return this;}
            public Builder profileImg (String profileImg){this.profileImg=profileImg; return this;}
            public Builder phone (String phone){this.phone=phone; return this;}
            public Builder email (String email){this.email=email; return this;}
            Member build(){ return new Member(this);}
        }

        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s",
                    userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{ //서비스
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById(String id);
        List<Member> findByName(String name);
        List<Member> findByAll();
        int count();
        boolean existsById(String id);
        void clear();
    }

    static class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;

        MemberServiceImpl(){
            this.map = new HashMap<>();
        }
        @Override public void save(Member member){map.put(member.getUserid(), member);}

        @Override
        public void update(Member member){map.replace(member.getUserid(), member);}

        @Override
        public void delete(Member member){map.remove(member.getUserid());}

        @Override
        public Member findById(String id) {
            return map.get(id);
        }
        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }
        @Override
        public List<Member> findByAll() {
            return (List<Member>) map.values();
        }
        @Override
        public int count() {
            return map.size();
        }
        @Override
        public boolean existsById(String id) {
            return map.containsKey(id);
        }

        @Override
        public void clear() {
            map.clear();
        }
    }

}
