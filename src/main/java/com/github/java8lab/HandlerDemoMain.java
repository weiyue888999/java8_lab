package com.github.java8lab;

public class HandlerDemoMain {

    public static void main(String[] args) {
        Handler handler = new MyHandler();
        handler.handle();

        Handler.display();
    }
}
