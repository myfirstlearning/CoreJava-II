package com.collections;

//Collection - Interface

//1 //List extends Collection
    // ArrayList, LinkedList, Vector(thread safe, 2 times of its current size)


//2 //Set extends Collection
//3 //Queue extends Collection


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;

//Map
public class ListMain {

     //Default size is 10
     //start element is at index 0
     //order collections
     //accept duplicates
     //we are doing more retrievals
     //re-indexing happens when we perform removals
    //add, remove, contains, clear, set, get(i), size()
    public static void main(String[] args) {

        //LinkedList -> faster in modifications(insertions and deletions)
        //Node based data structure
        //each node contains data and pointer to previous node and pointer to next node

        List<String> stringList = new LinkedList<>();
        stringList.add("red");
        stringList.add("green");
        stringList.add("blue");


        Predicate<String> pd = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("b");
            }
        };

        stringList.removeIf(pd);
        stringList.removeIf(s-> s.startsWith("b"));

        //remove first, remove last, add first, add last
        LinkedList<String> stringLinkedList = new LinkedList<>();

        List<Short> shortList = new ArrayList<>();
        shortList.add((short)1);

        Collections.sort(stringList);

        List<Student> students = new ArrayList<>();
        Collections.sort(students);
        Collections.sort(students, (s1,s2)-> s1.getCity().compareTo(s2.getCity()));

        //looping through collection
        //forEach
        //Consumer FI
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        stringList.forEach(consumer);
        stringList.forEach(s-> System.out.println(s));

    }



}
