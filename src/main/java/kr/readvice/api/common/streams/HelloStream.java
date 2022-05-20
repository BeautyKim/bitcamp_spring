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
 * desc          : 스트림 forEach
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
    }

    interface HelloService{
        Set<String> greet(String[] arr);
    }

    @Test
    void HelloStreamTest(){
        String[] arr = {"한국어 안녕", "영어 Hello"};
        HelloService h = new HelloService() {
            @Override
            public Set<String> greet(String[] arr) {
                return Arrays.asList(arr)
                        .stream()
                        .filter(e -> e.startsWith("한국어"))
                        .collect(Collectors.toSet());
            }
        };
        Set<String> s = h.greet(arr);
        s.forEach(System.out::println);
    }
}
