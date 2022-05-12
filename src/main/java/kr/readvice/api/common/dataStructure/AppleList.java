package kr.readvice.api.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static kr.readvice.api.common.lambda.Lambda.*;

/**
 * packageName   : kr.readvice.api.common.dataStructure
 * fileName      : AppleList
 * author        : beautyKim
 * date          : 2022-05-11
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         2022-05-11        최초 생성
 */
// AppleList color price origin
public class AppleList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AppleService service = new AppleServiceImpl();
        while (true) {
            System.out.println("0.exit 1.save 2.update 3.delete 4.findByAll 5.findByOrigin 6.findByColor 7.count 8.findById 9.clear");
            switch (s.next()) {
                case "0":
                    return;
                case "1":
                    Apple kim = new Apple.Builder()
                            .origin("영동")
                            .price(1000)
                            .color("RED")
                            .build();
                    service.save(kim);
                    Apple hong = new Apple.Builder()
                            .origin("충주")
                            .price(2000)
                            .color("RED")
                            .build();
                    service.save(hong);
                    Apple you = new Apple.Builder()
                            .origin("충주")
                            .price(5000)
                            .color("RED")
                            .build();
                    service.save(you);
                    System.out.println("저장완료~~");
                    break;
                case "2":
                    //service.update();
                    break;
                case "3":
                    break;
                case "4":
                    System.out.println("모든 사과 : " + service.findAll());
                    break;
                case "5":
                    System.out.println("같은 원산지 : " + service.findByOrigin("충주"));
                    break;
                case "6":
                    System.out.println("같은 색상 : " + service.findByColor("RED"));
                    break;
                case "7":
                    System.out.println("총 사과 회원 수 : " + service.count() + "명");
                    break;
                case "8":
                    break;
                case "9":
                    service.clear();
                    break;
                case "10":
                    System.out.println("사과 가격은 "+ integer("1000"));
                    System.out.println("내가 만든 배열의 사이즈는 "+array(7));
                    break;
                default:
                    break;
            }

        }
    }

    @Data
    public static class Apple{
        private String color, origin;
        private int price;

        public Apple(Builder builder){
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;

        }

        @NoArgsConstructor static public class Builder{
            private String color, origin;
            private int price;
            public Builder color (String color){this.color=color; return this;}
            public Builder origin (String origin){this.origin=origin; return this;}
            public Builder price (int price){this.price=price; return this;}
            public Apple build(){ return new Apple(this);}
        }

        @Override public String toString(){
            return String.format("[사과 스펙] color: %s, origin: %s, price: %d", color, origin, price);
        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(int i, Apple apple);
        void delete(Apple apple);
        List<Apple> findAll();
        List<Apple> findByOrigin(String origin);
        List<Apple> findByColor(String color);
        Apple findById(int i);
        int count();
        void clear();
    }


    static class AppleServiceImpl implements AppleService{
        private final List<Apple> list;

        public AppleServiceImpl() {this.list = new ArrayList<>();}

        @Override
        public void save(Apple apple) {list.add(apple);}

        @Override
        public void update(int i, Apple apple){list.set(i, apple);}

        @Override
        public void delete(Apple apple) {list.remove(apple);}

        @Override
        public List<Apple> findAll() {
            return list;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return list.stream()
                    .filter(apple -> apple.getOrigin().equals(origin))
                    .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findByColor(String color) {
            return list.stream()
                    .filter(apple -> apple.getColor().equals(color))
                    .collect(Collectors.toList());
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() { return list.size();}

        @Override
        public void clear() {list.clear();}
    }

}
