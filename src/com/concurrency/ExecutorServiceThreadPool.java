package com.concurrency;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//CachedThreadPool -- creates threads when needed as the tasks arrives, submitting too many tasks
//FixedThreadPool(int no of threads) -- these five threads will be used to process all incoming threads
//scheduledThreadPool
public class ExecutorServiceThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0;i<=5;i++){
            Task task = new Task("Task " + i);
            System.out.println("A new task has been added : " + task.getName());
            executorService.execute(task);
        }
        executorService.shutdown();
    }

}

class Task implements Runnable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task(String name) {
        this.name = name;
    }



    @Override
    public void run() {

        try{

            Long duration = (long)(Math.random() * 10);
            System.out.println("Doing a task during : " + name);
            TimeUnit.SECONDS.sleep(duration);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
