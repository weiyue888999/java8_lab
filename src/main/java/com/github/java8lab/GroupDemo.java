package com.github.java8lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupDemo {

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

        {
            Map<Long,List<UserDO>> map = list.stream().collect(Collectors.groupingBy(UserDO::getId));

            map.forEach((id,userDos)->{
                System.out.println(id+"-->"+userDos);
            });
        }

        System.out.println(".......");

        {
            UserDO userDO = new UserDO(null,"guangyue");
            list.add(userDO);
        }

        {
            Map<Long,List<UserDO>> map = list.stream().filter(userDO -> { return userDO != null && userDO.getId() != null;})
                    .collect(Collectors.groupingBy(UserDO::getId));

            map.forEach((id,userDos)->{
                System.out.println(id+"-->"+userDos);
            });

        }

        System.out.println("........");

    }
}
