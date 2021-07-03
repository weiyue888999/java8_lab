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

        Stream<UserDO> stream = list.stream();
        System.out.println(stream);
        System.out.println(System.identityHashCode(stream));
        System.out.println("......");


        Stream<UserDO> stream1 = stream.filter(p1);
        System.out.println(stream1);
        System.out.println(System.identityHashCode(stream1));


        List<UserDO> resultList = list.stream().filter(userDO -> userDO.getId().equals(1L)).collect(Collectors.toList());
        resultList.forEach(x -> System.out.println(x));
    }
}
