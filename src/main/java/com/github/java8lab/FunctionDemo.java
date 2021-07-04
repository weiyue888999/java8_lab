package com.github.java8lab;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> m1 = (x) -> x * x;
        Function<Integer, Integer> m2 = (x) -> x + 1;
        Function<Integer, Integer> m3 = m1.compose(m2);
        Function<Integer, Integer> m4 = m1.andThen(m2);

        Integer r1 = m3.apply(1);
        System.out.println(r1);

        Integer r2 = m4.apply(1);
        System.out.println(r2);
    }
}
