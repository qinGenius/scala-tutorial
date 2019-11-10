package com.eagle.controlabstraction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * @author qinlinsen
 */
public class MathOperationTest {
    private Integer calculate(BinaryOperator<Integer> operator, Integer a, Integer b){
       return operator.apply(a,b);
    }

    public Integer add(Integer a,Integer b){
        return calculate((a1,b1)->a1+b1,a,b);
    }

    public Integer subtract(Integer a,Integer b){
        return calculate((a1,b1)->a1-b1,a,b);
    }

    public Integer multiply(Integer a,Integer b){
        return calculate((a1,b1)->a1*b1,a,b);
    }
    public Integer divide(Integer a,Integer b){
        return calculate((a1,b1)->a1/b1,a,b);
    }
    public static void main(String[] args) {
        Integer add = new MathOperationTest().add(1, 3);
        Integer multiply = new MathOperationTest().multiply(1, 3);
        Integer divide= new MathOperationTest().divide(3, 3);
        Integer subtract= new MathOperationTest().subtract(3, 3);
        System.out.println(add);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(subtract);
    }
}
