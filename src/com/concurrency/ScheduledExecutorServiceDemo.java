package com.concurrency;

import java.util.concurrent.*;

//if we want to run a task scheduled, then we use scheduleES
//Schedule
//ScheduleAtFixedRate - Runnable
//ScheduleWithFixedDelay - Runnable - waits for your previous task to finish
public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException{

        ScheduledExecutorService se = Executors.newSingleThreadScheduledExecutor();
        Callable<String> callable = ()->"hello";

        Runnable r1 = ()->{
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Runnable 1 finishing...");
        };

        ScheduledFuture<String> sf = se.schedule(callable,5, TimeUnit.SECONDS);
        System.out.println(sf.get());

        Runnable r = ()-> System.out.println("hello runnable");
        //scheduled at fixed rate doesnot wait for the previous to finish
        //it just starts a new task based on the interval set
        ScheduledFuture sr = se.scheduleAtFixedRate(r,1,5,TimeUnit.SECONDS);
        System.out.println(sr.get());

        //scheduled with fixed delay waits for the previous task to finish
        ScheduledFuture scheduledFuture = se.scheduleWithFixedDelay(r1,0,1,TimeUnit.SECONDS);
        System.out.println(scheduledFuture.get());

        System.out.println("Finished");
        se.shutdown();//this has to be an event in the app/framework which kills the service
    }

}
