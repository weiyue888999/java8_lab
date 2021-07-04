package com.github.java8lab;

public class MyHandler implements Handler{
    @Override
    public void handle() {
        preHandle();
        afterHandle();
    }
}
