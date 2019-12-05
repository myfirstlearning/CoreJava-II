package com.concurrency;


import java.util.concurrent.*;

//java5 executor service
//Single thread executor
//thread pool
//scheduled executor
//execute-Runnable, submit-Callable and Runnable
//Shutting down -> shutDown(), shutDownNow()
//awaitTermination
//Future -> we can use Future object to store the result
//execute -> Runnable
//submit -> Callable and Runnable
//Runnable -> Future -> null -> get
//callable -> Future<T> call(){}

public class ExecutorServiceDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executorService = null;
        try {
            //Single thread executor
            // all the tasks gets executed one after the other
            executorService = Executors.newSingleThreadExecutor();
            executorService.execute(() -> System.out.println(Thread.currentThread().getName()));
            executorService.execute(() -> System.out.println("Second Task"));
            executorService.execute(() -> System.out.println("Third task"));
            //executing callable FI which return Future
            Future<Integer> f = executorService.submit(() -> {
                Thread.sleep(1000);
                return 10;
            });
            //System.out.println("After 100 mills " + f.get(100, TimeUnit.MILLISECONDS));//throws TimeoutException if value is not present
            System.out.println(f.get());//waits until it gets result

            Future future = executorService.submit(() -> System.out.println("runnable with submit"));
            System.out.println(future.get());//returns null or runnable
        }finally {
            executorService.shutdown();//waits until all tasks are completed

            System.out.println(executorService.isShutdown());//returns true if executor service is shutdown
            System.out.println(executorService.isTerminated());//returns true if all tasks are completed

            if(executorService != null){
                executorService.awaitTermination(1,TimeUnit.MINUTES);
                // check whether all tasks are finished
                if(executorService.isTerminated()){
                    System.out.println("All tasks finished");
                }else{
                    System.out.println("At least one task is still running");
                }
            }
        }

    }

}
