package com.github.java8lab;

import java.util.Arrays;
import java.util.List;

public class CollectDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","2");

        StringBuffer sb = list.stream().collect(StringBuffer::new,StringBuffer::append,StringBuffer::append);
        String str = sb.toString();
        System.out.println(str);
    }
}
