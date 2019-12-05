package com.streams;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.function.*;

public class SupplierMain {

    public static void main(String[] args) {

        Supplier<StringBuffer> S = StringBuffer::new;
        System.out.println(S.get());

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier);

        IntSupplier intSupplier = () -> 1;
        System.out.println(intSupplier.getAsInt());

        LongSupplier longSupplier = () -> new Long(10);
        System.out.println(longSupplier.getAsLong());

        DoubleSupplier doubleSupplier = () -> 3.14;
        System.out.println(doubleSupplier.getAsDouble());

    }

}
