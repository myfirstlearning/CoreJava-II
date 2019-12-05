package com.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//BiConsumer -> void accept(T t, U u)
public class BiConsumerMain {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + s2);
            }
        };

        BiConsumer<String, String> biConsumer1 = (s1, s2)->{
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer1.accept("BiConsumer", "FunctionalInterface");

        Map<String, Integer> map = new HashMap<>();
        map.put("NJ",1);
        map.put("NY",2);

        BiConsumer<String, Integer> stringIntegerBiConsumer = (k,v)-> map.put(k,v);
        stringIntegerBiConsumer.accept("CT",3);
        map.forEach((k,v)-> System.out.println(k+v));


    }

}
