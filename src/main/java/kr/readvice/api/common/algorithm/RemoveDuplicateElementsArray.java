package kr.readvice.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName   : kr.readvice.api.common.algorithm
 * fileName      : Remove
 * author        : beautyKim
 * date          : 2022-05-17
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         2022-05-17        최초 생성
 */
public class RemoveDuplicateElementsArray {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        int a;

    }
    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void SolutionTest(){

    }
}
