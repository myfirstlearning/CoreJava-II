package com.concurrency;

public class CreatingThread {

    public static void main(String[] args) {

        //void run() {}
        Runnable runnable = () -> System.out.println("Hello World");

        Thread t = new Thread(runnable);
        t.start();

        Thread t2 = new PrinterThread();
        t2.start();
        //t2.start(); Illegal tread state exception
        System.out.println("Main finished execution");


    }


}
    class PrinterThread extends Thread {

        @Override
        public void run(){
            System.out.println("printed something");
        }

    }