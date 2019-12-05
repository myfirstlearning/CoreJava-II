package com.concurrency;

public class ThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> System.out.println("Thread - 1"));
        Thread t2 = new Thread(()-> System.out.println("Thread - 2"));
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }

}
