package com.github.java8lab;

public interface Handler {

    static void display(){
        System.out.println("display");
    }

    default void preHandle(){
        System.out.println("preHnadle");
    }

    default void afterHandle(){
        System.out.println("afterHandle");
    }

    void handle();
}
