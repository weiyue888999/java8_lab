package com.github.java8lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

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

        List<Long> idList = list.stream().map(userDO -> userDO.getId()).collect(Collectors.toList());
        System.out.println(idList);

        List<Long> distIdList = idList.stream().distinct().collect(Collectors.toList());
        System.out.println(distIdList);
    }
}
