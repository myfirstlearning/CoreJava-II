package com.instance;


//instance of
public class InstanceOfMain {

    public static void main(String[] args) {

        String s = "Hello";
        System.out.println(s instanceof String);
        Animal a = new Animal();
        System.out.println(a instanceof Animal);
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        Cat c1 = new Cat();
        System.out.println(a2 instanceof Animal);
        System.out.println(a2 instanceof Cat);
        System.out.println(a2 instanceof Object);
        System.out.println(a3 instanceof Animal);
        System.out.println(a3 instanceof Dog);
        //System.out.println(c1 instanceof Dog); Compile time error
        System.out.println(c1 instanceof Animal);
    }

}
