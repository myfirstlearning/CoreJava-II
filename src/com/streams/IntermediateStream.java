package com.streams;


import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Intermediate Operations -> operation result will be stream
//filter(predicate), distinct, limit(int), skip(int), sorted(Comparator), peek(Consumer), map()

public class IntermediateStream {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1,2,5,3,4,7,6,9,8);
        //filter
        //integerStream.filter(i-> i%2 == 0).forEach(a -> System.out.println(a));
        //Set<Integer> integerSet = integerStream.filter(i->i%2 != 0).collect(Collectors.toSet());
        //System.out.println(integerSet);
        //Distinct
        //integerStream.distinct().forEach(a -> System.out.println(a));
        //Skip
        //integerStream.skip(4).filter(i->i%2 == 0).forEach(a-> System.out.println(a));
        //integerStream.filter(i->i%2 == 0).limit(3).forEach(System.out::println);
        //integerStream.sorted().forEach(System.out::println);
        //integerStream.collect(Collectors.toCollection(TreeSet::new));
        //peek (used for debugging)
        //long x = integerStream.skip(4).filter(i->i%2 == 0).peek(System.out::println).count();

        //map (Function <T,R> apply)
        Stream<String> stringStream = Stream.of("hello", "bye", "a");
        stringStream.map(a -> a + "some").forEach(System.out::println);

    }

}
