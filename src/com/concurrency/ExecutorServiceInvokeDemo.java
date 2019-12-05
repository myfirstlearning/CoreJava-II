package com.concurrency;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

//invokeAny
//invokeAll
public class ExecutorServiceInvokeDemo {

    public static void main(String[] args) {

        ExecutorService executorService = null;
        executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 1";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 2";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 3";
            }
        });


        //invokeAny executes any single task
        /*String result = null;
        try{
            result = executorService.invokeAny(callables);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        System.out.println("result = " + result);*/

        //invokeAll executes all tasks
        List<Future<String>> futures = null;
        try{
            futures = executorService.invokeAll(callables);

            for (Future<String> future: futures){
                System.out.println("future.get = " + future.get());
            }

        }catch(InterruptedException | ExecutionException e){
               e.printStackTrace();
        }


    }

}
