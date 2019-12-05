package com.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//predicate -> boolean test(T t)
public class PredicateMain {

    public static void main(String[] args) {

        Predicate<String> predicate = (t)->t.startsWith("he");
        System.out.println(predicate.test("hello world"));
        System.out.println(predicate.test("functional interface"));
        Predicate<List<String>> predicate1 = (p)->p.contains("NY");
        System.out.println(predicate1.test(Arrays.asList("NY","NJ","CT")));
        System.out.println(predicate1.test(Arrays.asList("NJ","CT")));

    }
}
