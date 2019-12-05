package com.instance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Object (parent) -> equals, hashcode, toString(convert object to string)
//hashcode -> HashMap, HashSet, HashTable, ConcurrentHashMap
public class Student {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    /*
    @Override
    public int hashCode(){
        return firstName.hashcode() + lastName.hashCode();
    }
     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Howdy");
        System.out.println(sb);

        Student s1 = new Student();
        s1.setFirstName("John");
        s1.setLastName("Wick");
        System.out.println(s1);

        Student s2 = new Student();
        s2.setFirstName("John");
        s2.setLastName("Wick");
        System.out.println(s2);

        List<Integer> intList = Arrays.asList(1,2,3,4);
        System.out.println(intList);

        int[] numbers = {1,2,3,4};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        List<String> ls = new ArrayList<>();
        ls.add("Google");
        ls.add("Microsoft");
        ls.add("Amazon");
        System.out.println(ls);


        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); //Object comparision
        System.out.println(s1.getFirstName().equals(s2.getFirstName())); //string comparision

    }
}
