package com.streams;

import java.util.function.*;

public class ConsumerMain {

    public static void main(String[] args) {

        Consumer<String> consumer = (a)-> System.out.println(a);
        consumer.accept("hello");

        IntConsumer intConsumer = (a)-> System.out.println(a+1);
        intConsumer.accept(10);

        LongConsumer longConsumer = (a)-> System.out.println(a+10);
        longConsumer.accept(20);

        DoubleConsumer doubleConsumer = System.out::println;
        doubleConsumer.accept(12.34);

        ObjIntConsumer<String> objIntConsumer = (a1,a2)-> System.out.println(Integer.parseInt(a1)+a2);
        objIntConsumer.accept("10",20);


    }

}
