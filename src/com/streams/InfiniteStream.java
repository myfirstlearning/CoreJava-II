package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {
        //infinite streams
        //Stream<Double> randoms = Stream.generate(Math::random);
        //Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2);

        List<String> list = Arrays.asList("Toby", "Anna", "Leory", "Alex");
        List<String> filteredList = new ArrayList<>();
        list.stream().filter(i->i.length() == 4).forEach(i->filteredList.add(i));
        filteredList.forEach(i-> System.out.println(i));

        Collections.sort(filteredList);


    }

}
