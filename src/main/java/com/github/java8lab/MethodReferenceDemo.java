package com.github.java8lab;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReferenceDemo {

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1L,2L);
        list.stream().forEach(System.out::println);

        int n = 10;

        executor.submit(()->{
            System.out.println(Thread.currentThread());
            list.stream().forEach(System.out::println);
        });

        executor.shutdown();
    }
}
