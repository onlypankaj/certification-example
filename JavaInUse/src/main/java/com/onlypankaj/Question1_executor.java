package com.onlypankaj;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question1_executor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> System.out.print("JavaInUse "));
        // line l1
        Future<String> future = executorService.submit(() -> "Rocks");
        System.out.print(future.get()); // line l2
        executorService.shutdown();
    }
}
