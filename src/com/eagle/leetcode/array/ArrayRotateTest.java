package com.eagle.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author qinlinsen
 */
public class ArrayRotateTest {
    private static  <T> List<T> swap(List<T> one){
        Objects.requireNonNull(one);
        if(one.size()==0){
            throw new IllegalArgumentException(one+" is empty list");
        }

        if(one.size()==1){
            return one;
        }
        List<T> other = new ArrayList<>();
        int lastElementIndex = one.size() - 1;
        T lastElement = one.get(lastElementIndex);
        List<T> remainList = one.subList(0, lastElementIndex);
        other.add(lastElement);
        other.addAll(remainList);
        return other;
    }

    public static  <T> List<T> rotate(List<T> one,Integer step){
        Objects.requireNonNull(one);
        Objects.requireNonNull(step);
        if(step<0){
            throw new IllegalArgumentException("step is non-negative");
        }

        for (int i=0;i<step;i++){
            one=swap(one);
        }
        return one;
    }
    public static void main(String[] args) {
        List<Integer> result = rotate(Arrays.asList(1,2,3,4,5,6,7), 3);
        result.stream().forEach(System.out::println);
    }
}
