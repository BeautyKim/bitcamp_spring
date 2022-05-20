package kr.readvice.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * packageName   : kr.readvice.api.common.algorithm
 * fileName      : MaxMin
 * author        : beautyKim
 * date          : 2022-05-17
 * desc          : 최소최대값 구하기
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         2022-05-17        최초 생성
 */
public class MaxMin {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Solution{
        private int[] arr;
        private int max, min, elem;

        @Override
        public String toString() {
            return String.format("최고값: %d 최소값: %d", max, min);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);}

    @Test
    void SolutionTest(){
        int[] arr = {1, 788, 5, 9, 10, 33};
        SolutionService f = e -> {
            int max = 0;
            for(int i : e.getArr()){
                if(i > max) max = i;
            }
            int min = max;
            for(int i : e.getArr()){
                if(i < min) min = i;
            }
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }
}
