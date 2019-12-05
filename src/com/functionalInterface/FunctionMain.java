package com.functionalInterface;

import java.util.function.Function;

//Function<T, R> -> R apply(T t){}
public class FunctionMain {

    public static void main(String[] args) {

        Function<String, String> function = (s1)-> s1 + "city";
        function.apply("NY");

        Function<String,Integer> function1 = (s1)-> Integer.parseInt(s1);
        function1.apply("1");

        Function<String,Integer> function2 = (s1)->s1.length();
        function2.apply("hello");

    }

}
