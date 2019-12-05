package com.functionalInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

//Supplier -> get() -> returns same object
public class SupplierMain {

    public static void main(String[] args) {

        Supplier<StringBuffer> stringBufferSupplier = new Supplier<StringBuffer>() {
            @Override
            public StringBuffer get() {
                return new StringBuffer();
            }
        };
        Supplier<StringBuffer> stringBufferSupplier1 = ()->new StringBuffer();
        StringBuffer stringBuffer = stringBufferSupplier.get();
        StringBuffer stringBuffer1 = stringBufferSupplier1.get();

        Supplier<LocalDate> localDateSupplier = ()->{return LocalDate.now();};
        System.out.println(localDateSupplier);
        Supplier<LocalDate> localDateSupplier1 = ()->LocalDate.now();
        System.out.println(localDateSupplier1);




    }
}
