package com.collections;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

//Map(I)
//HashMap implements Map
//LinkedHashMap extends HashMap
//TreeMap
//HashTable
//LinkedHashTable
//HashMap -> an array (each location of the array is a singley linked list)
//put -> gets the hashcode of the key -> hash function(hashCode) -> return an integer
//which is the index inside the array
//same hashcode but equals method say they are different -> hash collision
//LinkedHashMap -> it maintains insertion order
//TreeMap -> it maintains sorted order -> uses compareTo
//HashTable -> thread safe, null keys or null values
//LinkedHashTable -> maintains insertion order
public class MapMain {

    public static void main(String[] args) {

        //Key, Value
        //doesn't allow duplicates
        //default size is 16
        //duplicate key-value pair, map prevents the duplicate key but will updates the value
        //no insertion order
        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("Ram", 10);
        stringMap.put("Ravi", 20);
        stringMap.put("Raja", 30);
        stringMap.put("Rani", 40);
        //hashcode and equals implementation
        stringMap.put("Ram", 100);

        for(Map.Entry<String, Integer> entry: stringMap.entrySet()){
            System.out.println(entry.getValue());
        }

        Student s1 = new Student("John", "Lewisville");
        s1.setState("NY");
        Student s2 = new Student("John", "Coppell");
        s2.setState("NJ");
        Student s3 = new Student("John", "Coppell");
        s3.setState("TX");
        Map<Student, Integer> studentRankingMap = new HashMap<>();
        studentRankingMap.put(s1, 1);
        studentRankingMap.put(s2, 2);
        studentRankingMap.put(s3, 3);
        System.out.println(studentRankingMap.size());
        System.out.println(studentRankingMap);
        //get a value by passing a key
        int x = studentRankingMap.get(s1);

        Map<Student, List<Integer>> stringListHashMap  = new HashMap<>();
        List<Integer> integerList = new LinkedList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        List<Integer> integerList1 = new LinkedList<>();
        integerList1.add(300);
        integerList1.add(200);
        integerList1.add(100);
        List<Integer> integerList2 = new LinkedList<>();
        integerList2.add(200);
        integerList2.add(100);
        integerList2.add(300);

        stringListHashMap.put(s1, integerList);
        stringListHashMap.put(s2, integerList1);
        stringListHashMap.put(s3, integerList2);

        System.out.println("**********************");
        System.out.println(stringListHashMap);
        stringListHashMap.get(s3).add(600);
        System.out.println("**********************");
        System.out.println(stringListHashMap);
        System.out.println("**********************");

        //An entry is a key+value
        //map is set of entries
        for(Map.Entry<Student, Integer> entry : studentRankingMap.entrySet()){
            System.out.println(entry.getValue());
        }


        BiConsumer<Student, Integer> biConsumer = new BiConsumer<Student, Integer>() {
            @Override
            public void accept(Student student, Integer integer) {
                System.out.println(student);
                System.out.println(integer);
            }
        };

        studentRankingMap.forEach(biConsumer);
        studentRankingMap.forEach((t,u)->{
            System.out.println(t);
            System.out.println(u);
         });


    }

}
