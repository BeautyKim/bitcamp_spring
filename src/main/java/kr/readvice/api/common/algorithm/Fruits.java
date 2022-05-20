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
 * fileName      : Fruits
 * author        : beautyKim
 * date          : 2022-05-17
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         2022-05-17        최초 생성
 */
public class Fruits {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        private int[][] arr;
        private int total, apple, grape, orange;

        @Override
        public String toString() {
            return String.format("총합: %d \n 사과 평균: %d \n 포도 평균: %d \n 오렌지 평균: %d",total, apple, grape, orange);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void SolutionTest(){
        int[][] arr = {{10000, 20000, 12000},
                        {8000, 3000, 15000},
                        {20000, 15000, 38000},
                        {13000, 20000, 30000},
                        {30000, 12000, 20000},
                        {35000, 30000, 25000},
                        {50000, 23000, 10000}};

        SolutionService f = e -> {
          int apple = 0;
          int grape = 0;
          int orange = 0;
          int total = 0;
        for(int[] i : e.getArr()){}
        return Solution.builder().total(total).apple(apple).grape(grape).orange(orange).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }
}
