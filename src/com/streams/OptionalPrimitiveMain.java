package com.streams;


import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//OptionalInt, OptionalDouble, OptionalLong
public class OptionalPrimitiveMain {

    public static void main(String[] args) {

        //avg - OptionalDouble for int, long, and double
        //max,min -> OptionalInt, OptionalLong, OptionalDouble
        //sum -> does not
        IntStream.of(1,2,3,4).sum();
        OptionalDouble optionalDouble = IntStream.of(1,2,3,4).average();
        optionalDouble.getAsDouble();
        optionalDouble.ifPresent(a-> System.out.println(a));
        optionalDouble.orElseGet(()->1.2);

        OptionalInt optionalInt = IntStream.of(1,2,3,4,5).max();
        optionalInt.ifPresent(System.out::println);

        OptionalLong optionalLong = LongStream.of(1,2,3,4,5,6,7,8).max();
        optionalDouble.ifPresent(System.out::println);



    }

}
