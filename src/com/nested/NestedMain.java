package com.nested;


//Nested class -> class inside another class
//Inner classes, static nested classes
//Inner class -> Anonymous inner class(abstract, interfaces) and local inner class(inside methods)

import sun.applet.Main;

public class NestedMain {
    int x = 10;
    public class Inner{

        //cannot have static variables/ static methods
        //final static variables are allowed
        public void print(){
            System.out.println("Welcome to Inner");
            System.out.println(x);
        }
    }

    //what a regular class can have
    public static class StaticNested{
        static void staticPrint(){
            System.out.println("static print");
        }

        void printer(){

        }
    }

    public static void main(String[] args) {
        NestedMain nm = new NestedMain();
        Inner in = nm.new Inner();
        in.print();

        StaticNested staticNested = new StaticNested();
        staticNested.staticPrint();
        NestedMain.StaticNested.staticPrint();
    }

}
