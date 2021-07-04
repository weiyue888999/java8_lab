package com.github.java8lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

    public static void main(String[] args) {

        List<UserDO> userDOList = new ArrayList<>();

        {
            UserDO userDO = new UserDO();
            userDO.setId(1L);
            userDO.setName("weiyue");
            userDOList.add(userDO);
        }
        {
            UserDO userDO = new UserDO();
            userDO.setId(1L);
            userDO.setName("wei");
            userDOList.add(userDO);
        }
        {
            UserDO userDO = new UserDO();
            userDO.setId(2L);
            userDO.setName("weiguangyue");
            userDOList.add(userDO);
        }

        {
            Map<Long, UserDO> map1 = userDOList.stream().collect(Collectors.toMap(UserDO::getId, Function.identity(), (oldVal, newVal) -> {
                return newVal;
            }));
            System.out.println(map1);
        }

        {
            //默认收集成List
            Map<Long, List<UserDO>> map1 = userDOList.stream().collect(Collectors.groupingBy(UserDO::getId));
            System.out.println(map1);

            //带参数，收集成List
            Map<Long, List<UserDO>> map2 = userDOList.stream().collect(Collectors.groupingBy(UserDO::getId, Collectors.toList()));
            System.out.println(map2);

            //downstream可以指定成Set
            Map<Long, Set<UserDO>> map3 = userDOList.stream().collect(Collectors.groupingBy(UserDO::getId, Collectors.toSet()));
            System.out.println(map3);
        }

        {
            userDOList.stream().collect(Collectors.toMap(UserDO::getId, Function.identity()));
        }

        {
            Map<Long, String> map = userDOList.stream().collect(Collectors.toMap(UserDO::getId, u -> u.getName()));
        }

        {
            List<Long> list = Stream.of(1L, 2L, 3L).collect(Collectors.mapping(x -> x + 1, Collectors.toList()));
            System.out.println(list);
        }

    }
}
