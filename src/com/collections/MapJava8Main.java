package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

//putIfAbsent -> put when the value is null and key doesn't match with existing keys
//Merge
//Compute, ComputeIfAbsent, ComputeIfPresent

//Functional Interfaces
//Consumer, BiConsumer, Predicate, BiFunction, Function
public class MapJava8Main {

    public static void main(String[] args) {

        //putIfAbsent
        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("Ram", 10);
        stringMap.put("Ravi", 20);
        stringMap.put("Raja", 30);
        stringMap.put("Rani", 40);
        stringMap.put("Tom", null);
        stringMap.putIfAbsent("Ram", 100);
        stringMap.putIfAbsent("Tom", 18);
        System.out.println(stringMap);

        //Merge
        Map<String, Integer> stringMap1 = new HashMap<>();
        stringMap1.put("Ram", 10);
        stringMap1.put("Ravi", 20);
        stringMap1.put("Raja", 30);
        stringMap1.put("Rani", 40);
        stringMap1.put("Tom", null);
        stringMap1.put("peter", 10);
        //key, value, Bifunction
        BiFunction<Integer, Integer, Integer> bfu = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer * integer2;
            }
        };
        //stringMap1.merge("Ram", 4, bfu);
        //v1 is existing value
        //v2 is new value
        stringMap1.merge("Ram", 4, (v1, v2) -> v1 * v2);
        //stringMap1.merge("Ram", 4, (v1,v2)->v2);
        stringMap1.merge("Tom", 20, (v1, v2) -> v1 * v2);//merge handles nullPointer Exception

        //Compute(key, Existing value, Result data type)
        BiFunction<String, Integer, Integer> cbg = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return 10 * integer;
            }
        };

        stringMap1.compute("peter", cbg);

        stringMap1.computeIfPresent("Tom", cbg);

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 10;
            }
        };
        stringMap1.computeIfAbsent("John",function);
        stringMap1.computeIfAbsent("Paul",(f) -> 10);


    }
}
