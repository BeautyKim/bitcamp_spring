package kr.readvice.api.common.lambda;

/**
 * packageName   : kr.readvice.api.common.Lambda
 * fileName      : Calculator
 * author        : beautyKim
 * date          : 2022-05-11
 * desc          :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         2022-05-11        최초 생성
 */
public class Calculator {
    public static void main(String... args) {
        var s = "계산기";
        System.out.println(s);
        Calculator c = new Calculator();
        System.out.println("10 + 5 = " + c.operate(10, 5, (a, b)->a+b));
        System.out.println("10 - 5 = " + c.operate(10, 5, (a, b)->a-b));
        System.out.println("10 x 5 = " + c.operate(10, 5, (a, b)->a*b));
        System.out.println("10 / 5 = " + c.operate(10, 5, (a, b)->a/b));
    }
    interface Arithmetic{
        int operation(int a, int b);
    }
    private int operate(int a, int b, Arithmetic arith){
        return arith.operation(a, b);
    }


}