package com.generics;

public class Box<T> {

    private T contents;

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}
