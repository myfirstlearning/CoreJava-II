package com.generics;

import java.util.ArrayList;
import java.util.List;

//<>
//Creating custom generic type
//Type erasure -> compile time erasure
public class GenericsMain {

    public static void main(String[] args) {
        List<String> someList = new ArrayList<>();
        //Raw list
        //List raw = new ArrayList();
        someList.add("1");

        List<Object> objectList = new ArrayList<>();

        Box<Integer> integerBox = new Box<>();
        integerBox.setContents(10);

        Box<String> stringBox = new Box<>();
        stringBox.setContents("hello");
    }

}
