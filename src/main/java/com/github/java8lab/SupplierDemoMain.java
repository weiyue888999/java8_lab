package com.github.java8lab;

import java.util.function.Supplier;

public class SupplierDemoMain {

    public static void main(String[] args) {

        //这里为什么一个方法引用能够赋值给一个supplier
        Supplier<UserDO> supplier = UserDO::new;
        System.out.println(supplier.get());

        Handler handler = UserDO::new;
        handler.handle();

        ProcessorContext context = new ProcessorContext();

        Processor processor = System.out::println;
        processor.process(context);

    }
}
