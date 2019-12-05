package com.functionalInterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResultsMain {

    public static void main(String[] args) {

        //Collectors joining
        Stream<String> chars = Stream.of("a","p","p","l","e");
        String joined = chars.collect(Collectors.joining());
        System.out.println(joined);

        Stream<String> animals = Stream.of("lions","tigers","bears");
        Double doubleValue = animals.collect(Collectors.averagingInt(s->s.length()));


        Customer customer = new Customer("vinesh","hyderabad");
        Customer customer1 = new Customer("karthik","warangal");
        Customer customer2 = new Customer("srikanth","warangal");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);

        Stream<String> animals1 = Stream.of("lions","tigers","bears");
        Map<String, Integer> stringIntegerMap = animals1.collect(Collectors.toMap(a-> a , a -> a.length()));
        System.out.println(stringIntegerMap);
        //addressing map duplicate keys
        Stream<String> animals2 = Stream.of("lions","tigers","bears");
        Map<Integer, String> integerStringMap = animals2.collect(Collectors.toMap(a->a.length(),a->a,(k1,k2)->k1+","+k2));
        System.out.println(integerStringMap);
        System.out.println(integerStringMap.getClass());
        //return TreeMap
        Stream<String> animals3 = Stream.of("lions","tigers","bears");
        Map<Integer, String> integerStringMap1 = animals3.collect(Collectors.toMap(a->a.length(),a->a,(k1,k2)->k1+","+k2,TreeMap::new));
        System.out.println(integerStringMap1);
        System.out.println(integerStringMap1.getClass());
        //grouping by length
        Stream<String> animals4 = Stream.of("lions","tigers","bears");
        Map<Integer, List<String>> animalGroupingByLength = animals4.collect(Collectors.groupingBy(a->a.length()));
        System.out.println(animalGroupingByLength);
        //collecting as Set
        Stream<String> animals5 = Stream.of("lions","tigers","bears");
        Map<Integer, Set<String>> animalGroupingByLengthToSet = animals5.collect(Collectors.groupingBy(a->a.length(),Collectors.toSet()));
        System.out.println(animalGroupingByLengthToSet);
        //collecting to Set as TreeMap
        Stream<String> animals6 = Stream.of("lions","tigers","bears");
        Map<Integer, Set<String>> animalGroupingByLengthToSetAsTreeMap = animals6.collect(Collectors.groupingBy(a->a.length(),TreeMap::new,Collectors.toSet()));
        System.out.println(animalGroupingByLengthToSetAsTreeMap);
        //collect the count
        Stream<String> animals7 = Stream.of("lions","tigers","bears");
        Map<Integer, Long> animalCount = animals7.collect(Collectors.groupingBy(a->a.length(),Collectors.counting()));
        System.out.println(animalCount);

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        Map<Boolean,List<Integer>> evenOddMap = integerList.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList()));
        System.out.println(evenOddMap);
        Map<Boolean,Integer> result = integerList.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.summingInt(Integer::intValue)));
        System.out.println(result);

        //grouping By City
        Map<String,List<Customer>> stringListMap = customerList.stream().collect(Collectors.groupingBy(a->a.getCity()));
        System.out.println(stringListMap);
        Map<String,List<Customer>> stringListMap1 = customerList.stream().collect(Collectors.groupingBy(Customer::getCity));
        System.out.println(stringListMap1);

        //filter jerseyCity customers
        List<Customer> jerseyCityCustomer = customerList.stream().filter(cust->cust.getCity().equalsIgnoreCase("warangal")).collect(Collectors.toList());
        System.out.println(jerseyCityCustomer);

       /* Stream<String> animals8 = Stream.of("lions","tigers","bears");
        Map<Integer, Optional<Character>> optionalMap = animals8.collect(Collectors.groupingBy(String::length,Collectors.mapping(s->s.charAt(0),Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println(optionalMap);*/





    }

}
