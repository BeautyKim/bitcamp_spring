package kr.readvice.api.common.lambda;



import static kr.readvice.api.common.dataStructure.AppleList.Apple;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * packageName   : kr.readvice.api.common.lambda
 * fileName      : LambdaUtil
 * author        : beautyKim
 * date          : 2022-05-11
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         2022-05-11        최초 생성
 */
public class Lambda {
    public static void main(String[] args) {
        // System.out.println(integer("900"));
//        System.out.println(string(new Apple.Builder().origin("충주").color("RED").price(3000).build()));
//        System.out.println(
//                string(
//                        Arrays.asList(
//                                new Apple.Builder().origin("영동").color("RED").price(1000).build(),
//                                new Apple.Builder().origin("충주").color("RED").price(2000).build(),
//                                new Apple.Builder().origin("충주").color("RED").price(5000).build()
//                        ))
//        );
//        System.out.println(array(10).length);
        System.out.println(random(1,6));

    }
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }

    // String -> Integer
    public static int integer(String s){
        // Integer i = Integer.parseInt("900");
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(s);
    }
    // Object -> String
    public static String string(Object o){
        // String s = String.valueOf(o);
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
    }
    // String -> boolean
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);
    }
    // int[] arr = new int[8];
    // = int[]::new
    // int -> int[]
    public static int[] array(int a){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(a);
    }
    // 함수명 random, 람다로 바꾸기
    // 반환값 int
    //Supplier<Double> f = Math::random;
    public static int random(int min, int max){
        BiFunction<Integer, Integer, Integer> f = (t, u) -> (int)(Math.random()*u)+t;
        return f.apply(min, max);
    }
    public static File makeFile(String a){
        Function<String, File> f = File::new;
        return f.apply(a);
    }
    public static String date(){
        Supplier<String> s = () -> string(LocalDate.now());
        return string(s);

    }
}



