package kr.readvice.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName   : kr.readvice.api.common.algorithm
 * fileName      : CheckSameArray
 * author        : beautyKim
 * date          : 2022-05-17
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         2022-05-17        최초 생성
 */
public class CheckSameArray {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        private int[] arr1 = {1, 2, 3}, arr2 = {2, 3, 1};

        @Override
        public String toString() {
            String res = "";
            return String.format("A배열 %d B배열 %d 은 %s 배열입니다", arr1, arr2, res);
        }
    }
    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }

    @Test void SolutionTest(){
    }

}
