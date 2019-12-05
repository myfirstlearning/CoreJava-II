package com.generics;

public class Box2<T, U> {

    private T contents;
    private U text;

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public U getText() {
        return text;
    }

    public void setText(U text) {
        this.text = text;
    }
}
