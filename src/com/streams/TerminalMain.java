package com.streams;

import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalMain {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            };
        };

       /* Stream<Integer> integerStream = Stream.of(1,2,3,4);
        System.out.println(integerStream.count());*/
        //min(comparator) and max(comparator)
        /*System.out.println(integerStream.max((x,y)->x-y));
        System.out.println(integerStream.min((x,y)->x-y));
        System.out.println(integerStream.findFirst());
        System.out.println(integerStream.findAny());
        System.out.println(integerStream.allMatch(a->a.equals(1)));//false
        System.out.println(integerStream.anyMatch(a->a.equals(1)));
        System.out.println(integerStream.noneMatch(a->a.equals(7)));
        integerStream.forEach(i-> System.out.println(i));
        integerStream.forEach(System.out::println);
*/
        //reduce method(identity, accumulator(BinaryOperator)), (accumulator), (identity,accumulator,combiner))
        //Integer result = integerStream.reduce(2,(a,b)->a*b);

        //collect -> collect(Collectors), collect(BiConsumer), collect(supplier,BiConsumer-accumulator,BiConsumer-combiner)
        Stream<Character> characterStream = Stream.of('a','p','p','l','e');
        //Set<Character> set = characterStream.collect(Collectors.toSet());

        //collect(Supplier, BiConsumer-accumulator, BiConsumer-combiner)
        Supplier<StringBuilder> supplier = StringBuilder::new;
        BiConsumer<StringBuilder, Character> builderCharacterBiConsumer = (a,b)->a.append(b);
        BiConsumer<StringBuilder, StringBuilder> stringBuilderStringBuilderBiConsumer = (a,b)->a.append(b);
        StringBuilder word = characterStream.collect(supplier, builderCharacterBiConsumer, stringBuilderStringBuilderBiConsumer);
        System.out.println(word);
    }

}
