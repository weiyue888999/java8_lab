package com.github.java8lab;

public class DemoServiceImpl implements DemoService{

    @Override
    public void fun(){

        try {
            System.out.println("Hello,world");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {

    }
}
