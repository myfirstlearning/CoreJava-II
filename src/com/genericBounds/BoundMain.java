package com.genericBounds;



import java.util.ArrayList;
import java.util.List;

//bounded generics -> <String>
//unbounded generics -> <?>
//wildcards -> lower bound wild cards
//          -> upper bound wild cards -> u bet -> upper bound extends Type
// ? - no adds but we can add nulls can perform removals
// ? extends - no adds but we can add nulls and can perform removals
// ? super - add/remove is allowed
public class BoundMain {

    public static void test(List<? extends Number> numberList){

        //numberList.add(1);
    }

    public static void test1(List<? extends Animal> animals){

        //animals.add(new Dog());  // === not allowed to add

    }

    //Animals and Objects
    public static void test2(List<? super Animal> animals){

        animals.add(new Dog());

    }

    //Cats, Animals, Objects
    public static void test3(List<? super Cat> animals){

        animals.add(new Cat());
        //animals.add(new Animal()); doesn't compile


    }

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Animal());
        test1(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        test1(dogs);



        List<?> someList = new ArrayList<>();
        //someList.add(10); // === doesn't compile
        someList.add(null);
        List<?> someList1 = new ArrayList<Integer>(); // === doesn't
        //someList1.add(10);

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        print(intList);
    }

    public static void print(List<?> someList){
        someList.remove(new Integer(1));
        System.out.println(someList);
    }

    // === ?<any type of data> Immutable
    public static void print1(List<?> someList){

        //someList.add(10); // === doesn't compile Immutable
        //we cannot able to add but we can able to remove
        for (Object o: someList){
            System.out.println(o);
        }
    }

}

class Animal{

}

class Cat extends Animal{

}

class Dog extends Animal{

}
