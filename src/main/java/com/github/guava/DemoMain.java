package com.github.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class DemoMain {
    public static void main(String[] args) {

        Lists.newArrayList();
        Lists.newArrayListWithCapacity(10);

        Lists.newLinkedList();
        Lists.newCopyOnWriteArrayList();

        Maps.newHashMap();
        Maps.newHashMapWithExpectedSize(10);

        Sets.newHashSet();
        Sets.newHashSetWithExpectedSize(10);


    }
}
