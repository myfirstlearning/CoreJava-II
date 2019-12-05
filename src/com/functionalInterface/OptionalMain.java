package com.functionalInterface;

import java.util.Optional;

//orElse(T t), orElseThrow(Supplier<T> t)//throw Exception
//orElseGet(Supplier<T> t)
public class OptionalMain {

    public static Integer average(int... marks){
        if(marks.length == 0) {
        return null;
        }
        int total = 0;
        for(int s: marks){
            total += s;
        }
        return total/marks.length;
    }

    public static Optional<Integer> averageWithOptional(int... marks){
        if(marks.length == 0) {
            return Optional.empty();
        }
        int total = 0;
        for(int s: marks){
            total += s;
        }
        return Optional.of(total/marks.length);
    }

    public static void main(String[] args) {
        int[] x = {90,90};
        int[] x1 = {};

        Optional<Integer> optional = averageWithOptional(x);
        if(optional.isPresent()){
            Integer integer = optional.get();
            System.out.println(integer);
        }
        Optional<Integer> optional_1 = averageWithOptional(x);
        if(optional_1.isPresent()){
            Integer integer = optional_1.get();
            System.out.println(integer);
        }
        optional_1.ifPresent((t)-> System.out.println(t));

        optional_1.orElse(0);
        optional_1.orElseGet(()->0);
        //optional_1.orElseThrow(()-> {throw new IllegalStateException("Something went wrong");});


    }

}
