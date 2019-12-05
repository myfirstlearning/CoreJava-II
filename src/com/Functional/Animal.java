package com.Functional;

public class Animal {

    private String species;
    private boolean canHoop;
    private boolean canSwim;

    public Animal(String species, boolean canHoop, boolean canSwim){

        this.species = species;
        this.canHoop = canHoop;
        this.canSwim = canSwim;
    }

    public boolean canHoop(){
        return canHoop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }


}
