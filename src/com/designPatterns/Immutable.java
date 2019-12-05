package com.designPatterns;

//final
//Clonable -> marker interface to clone object
//Marker Interface doesn't have any methods
public final class Immutable implements Cloneable {

    private String text;


    public Immutable(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("You cannot clone");
    }
}
