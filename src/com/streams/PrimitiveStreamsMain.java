package com.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//IntStream(int, short, byte and char), LongStream(long), DoubleStream(float and double)
//mapToInt, mapToDouble, mapToLong - stream pipeline methods we can use
public class PrimitiveStreamsMain {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce((s,n)->s+n));
        System.out.println(IntStream.of(1,2,3).sum());
        System.out.println(IntStream.of(1,2,3).average());
        System.out.println(DoubleStream.of(12.1,20.0,13.0).sum());

        //range and rangeClosed
        IntStream.range(1,10).forEach(a-> System.out.println(a));
        System.out.println("****************");
        IntStream.rangeClosed(1,10).forEach(a-> System.out.println(a));
        System.out.println("*****************");

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = integerList.stream().filter(i->i%2 == 0).mapToInt(i->i).sum();

        Item item = new Item();
        item.setName("Samsung galaxy");
        item.setPrice(500.0);
        item.setQuantity(20);

        Item item1 = new Item();
        item1.setName("Nexus");
        item1.setPrice(400.0);
        item1.setQuantity(10);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item1);
        int itemSum = itemList.stream().mapToInt(items->items.getQuantity()).sum();
        System.out.println(itemSum);
        Double averageItem = itemList.stream().mapToDouble(i->i.getPrice()).average().getAsDouble();
        System.out.println(averageItem);

        //summary statistics
        IntSummaryStatistics statistics = IntStream.of(1,2,3,4,5,6,7,8,9,10).summaryStatistics();
        System.out.println(statistics);

    }

}
