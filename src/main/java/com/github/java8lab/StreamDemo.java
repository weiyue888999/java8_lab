package com.github.java8lab;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","2");

        list.stream().forEach(System.out::println);

        list.stream().forEachOrdered(System.out::println);

    }
}
