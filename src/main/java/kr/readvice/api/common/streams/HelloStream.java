package kr.readvice.api.common.streams;

import kr.readvice.api.common.dataStructure.AppleList;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName   : kr.readvice.api.common.streams
 * fileName      : HelloStream
 * author        : beautyKim
 * date          : 2022-05-16
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-16         2022-05-16        최초 생성
 */
// 한국어 안녕, 영어 Hello
public class HelloStream {
    @Data
    public static class Hello{
    private String greeting, inLanguage;

    public Hello(Builder builder){
        this.greeting = builder.greeting;
        this.inLanguage = builder.inLanguage;
    }

    @NoArgsConstructor static public class Builder{
        private String greeting, inLanguage;
        public Builder greeting(String greeting){ this.greeting=greeting; return this;};
        public Builder inLanguage(String inLanguage){ this.inLanguage=inLanguage; return this;};
        public Hello buid(){return new Hello(this);}
    }
    }

    interface HelloService{
        Set<String> greet(String[] arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public Set<String> greet(String[] arr) {
            return Arrays.asList(arr)
                    .stream()
                    .filter(e -> e.startsWith("영어"))
                    .collect(Collectors.toSet());
        }
    }

    @Test
    void HelloStreamTest(){
        String[] arr = {"한국어 안녕", "영어 Hello"};
        HelloService h = new HelloServiceImpl();
        Set<String> s = h.greet(arr);
        s.forEach(System.out::println);
    }
}
