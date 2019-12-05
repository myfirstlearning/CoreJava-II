package com.collections;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private String city;
    private String state;

    public Student(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //Overrides equals and hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(city, student.city);
    }

    //hashcode method gets called first if two objects has the same hashcode
    //if hashcode is different then hashset treats the object as distinct
    //if hashcode is same then it calls equals method to compare the contents
    //It is good practice to multiple hashcode with prime Numbers
    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
