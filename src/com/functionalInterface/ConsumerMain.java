package com.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer -> void accept -> one parameter
public class ConsumerMain {

    public static void main(String[] args) {

        Consumer<StringBuffer> stringBufferConsumer = new Consumer<StringBuffer>() {
            @Override
            public void accept(StringBuffer stringBuffer) {
                stringBuffer.append("Consumer Interface");
            }
        };


        Consumer<String> consumer = (a)-> System.out.println(a + ", DEW");
        consumer.accept("Hello");

        StringBuffer stringBuffer = new StringBuffer("Hello");
        Consumer<StringBuffer> stringBufferConsumer1 = (a)->a.append(" world");
        stringBufferConsumer1.accept(stringBuffer);


        List<String> list = Arrays.asList("Hello", "hi", "how", "are", "you");
        list.forEach((h)-> System.out.println(h));
    }



}
