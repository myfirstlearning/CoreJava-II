package com.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMain {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello","bye","a");
        stream.map(a->a.toUpperCase()).forEach(System.out::println);
        System.out.println();
        Map<String,String> map = new HashMap<>();
        map.put("raja", "qa");
        map.put("tom","developer");
        map.put("mike","lead");
        map.put("ramu","developer");
        map.put("ravi","PM");
        List<String> keys = map.entrySet().stream().filter(a->a.getValue().equals("developer")).map(e->e.getKey()).collect(Collectors.toList());
        System.out.println(keys);


    }

}
