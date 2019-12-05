package com.Functional;

//() -> {statements}
public class LambdaMain {

    public static void main(String[] args) {
        Test t = (a,b)->{return a+b;};
        System.out.println(t.sum(1,2));
        Test t1 = (int a, int b)->{return a+b;};
        System.out.println(t1.sum(100, 200));
        AnotherTest anotherTest = () -> true;
        AnotherTest anotherTest1 = () -> {int a = 10; return true;};

        doSomething(() -> true);
    }

    public static void doSomething(AnotherTest anotherTest){

    }

}
