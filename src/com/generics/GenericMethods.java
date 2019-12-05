package com.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {

        Box2<String,Integer> box2 = new Box2<>();
        box2.setContents("Generics");
        box2.setText(10);
        print(Arrays.asList(1,2,3));
    }


    public static <T> void print(List<T> someList){

        for (T t: someList) {
            System.out.println(t);
        }
    }

    public static <T> List<T> printAnotherList(List<T> someList){
        for (T t: someList) {
            System.out.println(t);
        }
        return someList;
    }


}
