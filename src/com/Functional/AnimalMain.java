package com.Functional;

import java.util.function.Predicate;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Animal("A1", true, false);

        CheckTrait checkTrait = new CheckTrait() {
            @Override
            public boolean test(Animal animal) {
                return animal.canHoop();
            }
        };

        Predicate<Animal> animalPredicate = new Predicate<Animal>() {
            @Override
            public boolean test(Animal animal) {
                return animal.canHoop();
            }
        };

        checkTraits((a)->a.canHoop(), animal);
        checkTraits((a)->a.canSwim(), animal);
    }

    public static void checkTraits(CheckTrait Ct, Animal animal){
        if(Ct.test(animal)){
            // === doSomething
        }
    }
}
