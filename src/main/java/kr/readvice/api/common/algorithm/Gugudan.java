package kr.readvice.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName   : kr.readvice.api.common.algorithm
 * fileName      : Gugudan
 * author        : beautyKim
 * date          : 2022-05-18
 * desc          : 구구단
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         2022-05-17        최초 생성
 */
public class Gugudan {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        private int[][] arr = new int[8][9];

        @Override
        public String toString() {
            return Arrays.toString(arr);
        }
    }
    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void SolutionTest() {

    }
}
