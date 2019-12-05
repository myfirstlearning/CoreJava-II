package com.concurrency;

import java.util.concurrent.TimeUnit;

public class ThreadPooling {

    static int count;

    public static void main(String[] args) throws InterruptedException{

        Runnable runnable = ()->{
            for(int i=0;i<100;i++){
                count++;
            }
        };

        Thread t = new Thread(runnable);
        t.start();

        while (true){
            if(count == 100){
                System.out.println("breaking....");
                break;
            }
            System.out.println("Sleeping for One Second");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Waking up....");

        }

        System.out.println(count);

    }

}
