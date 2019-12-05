package com.enumaration;

//constructor get called only once
//enum cannot extend another enum, anything else
//create abstract method inside enums
public enum Season {

    WINTER("Medium"),
    SUMMER("High"),
    FALL("High"),
    SPRING("Medium");


    //constructor
    private String level;
    private Season (String level){
        this.level = level;
    }

   // public abstract void printLevel();

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
