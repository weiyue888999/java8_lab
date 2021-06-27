package com.github.java8lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<UserDO> resultList = list.stream().filter(userDO -> userDO.getId().equals(1L)).collect(Collectors.toList());
        resultList.forEach(x -> System.out.println(x));
    }
}
