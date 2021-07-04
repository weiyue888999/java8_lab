package com.github.java8lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

    public static void main(String[] args) {

        List<UserDO> list = new ArrayList<UserDO>();

        {
            UserDO userDO = new UserDO(1L,"wei");
            list.add(userDO);
        }


        {
            UserDO userDO = new UserDO(1L,"wei");
            list.add(userDO);
        }

        {
            UserDO userDO = new UserDO(1L,"wei");
            list.add(userDO);
        }

        {
            UserDO userDO = new UserDO(2L,"guangyue");
            list.add(userDO);
        }

        {
            UserDO userDO = new UserDO(2L,"guangyue");
            list.add(userDO);
        }

        Predicate<UserDO> p1 = (userDO)->{
            return userDO.getName().equals("wei");
        };

        Predicate<UserDO> p2 = (userDO)->{
            return userDO.getName().equals("guangyue");
        };

        //可传入简单表达式
        list.stream().filter(userDO -> userDO.getName().equals("weiguangyue"));

        //可传入完整的带有return的方法
        list.stream().filter((userDO) -> {return userDO.getName().equals("wei");});

        //因为断言是一个参数，所以不需要括号


        List<Object> ll = list.stream().map(userDO -> new Object()).collect(Collectors.toList());
        System.out.println(ll);

        list.removeIf(userDO -> userDO.getName().equals("wei"));

        Stream<Integer> numbers = Stream.of(1, 2, 3);
        numbers.forEach(System.out::println);

    }
}
