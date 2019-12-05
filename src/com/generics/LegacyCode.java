package com.generics;

import java.util.ArrayList;
import java.util.List;

public class LegacyCode {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        addSomethingToList(stringList);
        System.out.println(stringList);

    }

    public static void addSomethingToList(List list){
        list.add(100);
    }
}
