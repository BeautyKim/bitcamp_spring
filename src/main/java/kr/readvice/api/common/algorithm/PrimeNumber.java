package kr.readvice.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * packageName   : kr.readvice.api.common.algorithm
 * fileName      : PrimeNumber
 * author        : beautyKim
 * date          : 2022-05-17
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         2022-05-17        최초 생성
 */
public class PrimeNumber {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Solution{
        private int[] arr;
        private int start, end;

        @Override
        public String toString() {
            return String.format("");
        }
    }
    @FunctionalInterface private interface SolutionService{
        String solution(List<Integer> primes);
    }
    @Test
    void SolutionTest(){
        List<Integer> l = Arrays.asList(1, 788, 0, 5, 9, 10, 33);
        SolutionService sol = x -> "";
        System.out.println(sol.solution(l));
    }
}
