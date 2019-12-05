package com.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("MKyong");
        student.addBook("java 8 in action");
        student.addBook("Spring Boot in Action");
        student.addBook("Effective java (2nd Edition)");

        Student student1 = new Student();
        student1.setName("Zilap");
        student1.addBook("Learning Python");
        student1.addBook("Effective java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);

        List<String> names = list.stream().map(s->s.getBooks()).flatMap(x->x.stream()).distinct().collect(Collectors.toList());
        names.forEach(System.out::println);


    }


}

class Student{

    public String getName() {
        return name;
    }

    public void addBook(String book){

        if(this.books == null){
            this.books = new HashSet<>();
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }

    private String name;
    private Set<String> books;




}
