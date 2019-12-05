package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ChainingOptionsMain {


    static Optional<Integer> calculator(String s){

        return Optional.of(s).map(a->a.length());

    }


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1234, 2345, 3456, 8901);
        Optional<List<Integer>> optionalIntegers = Optional.of(integerList);
        optionalIntegers.map(a->a+" ").filter(a->a.length()>3).ifPresent(a-> System.out.println(a));

        String s = "hello";
        Optional<Integer> optionalInteger = Optional.of(s).map(a->a.length());
        Optional<Integer> optionalInteger1 = Optional.of(s).map(String::length);
        System.out.println(optionalInteger.get());
        System.out.println(optionalInteger1.get());

        int length = Optional.of("hello world").map(a-> calculator(a)).get().get();
        System.out.println(length);
        int length1 = Optional.of("hello world").flatMap(a-> calculator(a)).get();
        System.out.println(length);



    }

}
