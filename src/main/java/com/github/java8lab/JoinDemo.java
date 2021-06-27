package com.github.java8lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinDemo {

    public static void main(String[] args) {
        {
            List<String> list = Arrays.asList("1","2");
            String str = list.stream().collect(Collectors.joining());
            System.out.println(str);

            String str2 = list.stream().collect(Collectors.joining(","));
            System.out.println(str2);

            String str3 = list.stream().collect(Collectors.joining(",","[","]"));
            System.out.println(str3);
        }
        {

            String str = String.format("%d,%d,%d", 1,2,null);
            System.out.println(str);
        }
    }
}
