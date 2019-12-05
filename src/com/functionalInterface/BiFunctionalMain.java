package com.functionalInterface;

import java.util.function.BiFunction;

//BiFunctional<T,U,R> -> R apply(T t, U u)
public class BiFunctionalMain {

    public static void main(String[] args) {

        BiFunction<String,String,String> biFunction = (s1,s2)->s1+s2;
        System.out.println(biFunction.apply("hello","world"));

        BiFunction<String,String,Boolean> booleanBiFunction = (s1,s2)->s1.equals(s2);
        System.out.println(booleanBiFunction.apply("hello", "hello"));

    }

}
