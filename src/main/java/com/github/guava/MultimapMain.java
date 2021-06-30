package com.github.guava;

import com.github.common.People;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Iterator;
import java.util.Map;

public class MultimapMain {

    public static void main(String[] args) {

        Multimap<Long,People> multiMap = HashMultimap.create();

        {
            People p = new People();
            p.setId(1L);
            p.setLevel(1L);
            multiMap.put(p.getLevel(),p);
        }
        {
            People p = new People();
            p.setId(2L);
            p.setLevel(1L);
            multiMap.put(p.getLevel(),p);
        }
        {
            People p = new People();
            p.setId(3L);
            p.setLevel(2L);
            multiMap.put(p.getLevel(),p);
        }
        System.out.println("size="+multiMap.size());
        System.out.println("....");
        System.out.println(multiMap.keys());

        Iterator<Map.Entry<Long,People>> it = multiMap.entries().iterator();
        while(it.hasNext()){
            Map.Entry<Long,People> e = it.next();
            System.out.println(e.getKey()+","+e.getValue());
        }
    }
}
