package com.functionalInterface;

public class Main {

    public static void main(String[] args) {

        //anonymous inner type
        Test test = new Test() {
            @Override
            public String testMothod(String x, String y) {
                return x + y;
            }
        };


        Test test1 = (String x,String y)-> {
            System.out.println("Lambda!!!!");
            return x + y;
        };
        test1.testMothod("Hello", "Functional Interface");

        Test test2 = (x,y)-> {return x+y;};
    }

}
