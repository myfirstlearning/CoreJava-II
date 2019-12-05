package com.nested;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> even_numbers = new ArrayList<>();
        numbers.forEach(n -> {
            if (n % 2 == 0) {
                even_numbers.add(n);
            }
        });

        List<Integer> even_numbers2 = numbers.stream().filter(n-> n % 2 == 0).collect(Collectors.toList());


    }
    public static void main2(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");
        names.add("Chintu");


        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }


        // Getting Spliterator
        Spliterator<String> splitIterator = names.spliterator();
        /*Spliterator<String> splitIterator1 = splitIterator.trySplit();
        Spliterator<String> splitIterator2 = splitIterator.trySplit();
        Spliterator<String> splitIterator3 = splitIterator.trySplit();*/

        // Traversing elements
        //splitIterator.forEachRemaining(System.out::println);
        splitIterator.forEachRemaining(new Main()::test);
        splitIterator.forEachRemaining(s -> {
            System.out.println(s);
        }
        );
        /*splitIterator.forEachRemaining(new Consumer<String>() {
            public void accept(String t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });*/

        /*System.out.println("1");
        splitIterator1.forEachRemaining(System.out::println);
        System.out.println("2");
        splitIterator2.forEachRemaining(System.out::println);
        System.out.println("3");
        splitIterator3.forEachRemaining(System.out::println);*/
    }

    public  void test(String s) {
        System.out.println(s);
    }

}
