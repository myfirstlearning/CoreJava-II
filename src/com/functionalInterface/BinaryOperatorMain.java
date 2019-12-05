package com.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//BinaryOperator<T> -> T apply (T t1, t2)
public class BinaryOperatorMain {

    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (t1,t2)-> t1.concat(t2);
        System.out.println(binaryOperator.apply("hello","world"));

        BinaryOperator<List<Integer>> listBinaryOperator = (t1,t2)->{
            t1.removeAll(t2);
            return t1;
        };

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(listBinaryOperator.apply(list, Arrays.asList(1,4)));

    }

}
