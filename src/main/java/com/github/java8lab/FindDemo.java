package com.github.java8lab;

import com.github.common.OfferOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FindDemo {

    private List<OfferOrder> list = new ArrayList<>();

    @Before
    public void before() {
        this.list.clear();

        {
            OfferOrder offerOrder = new OfferOrder();
            offerOrder.setOfferId(1L);
            offerOrder.setQuantity(1L);
            offerOrder.setSignQuantity(1L);
            list.add(offerOrder);
        }
        {
            OfferOrder offerOrder = new OfferOrder();
            offerOrder.setOfferId(1L);
            offerOrder.setQuantity(1L);
            offerOrder.setSignQuantity(1L);
            list.add(offerOrder);
        }
        {
            OfferOrder offerOrder = new OfferOrder();
            offerOrder.setOfferId(2L);
            offerOrder.setQuantity(2L);
            offerOrder.setSignQuantity(2L);
            list.add(offerOrder);
        }

        {
            OfferOrder offerOrder = new OfferOrder();
            offerOrder.setOfferId(3L);
            offerOrder.setQuantity(3L);
            offerOrder.setSignQuantity(3L);
            list.add(offerOrder);
        }

        {
            OfferOrder offerOrder = new OfferOrder();
            offerOrder.setOfferId(4L);
            offerOrder.setQuantity(3L);
            offerOrder.setSignQuantity(3L);
            list.add(offerOrder);
        }
    }

    @After
    public void after() {

    }

    @Test
    public void test0() {
        //原样返回
        List<OfferOrder> resultList = list.stream().collect(Collectors.toList());
        System.out.println(System.identityHashCode(list));
        System.out.println(System.identityHashCode(resultList));
        System.out.println(resultList);
    }

    @Test
    public void test1() {
        //找到最小的
        Optional<OfferOrder> op = list.stream().min(Comparator.comparing(OfferOrder::getQuantity).reversed());
        OfferOrder result = op.orElse(null);
        System.out.println(result);
    }

    @Test
    public void test2() {

        //找到最大的，可能有多个
        System.out.println("find max list");
        OptionalLong op = list.stream().mapToLong(OfferOrder::getQuantity).max();
        long max = op.orElse(Long.MAX_VALUE);
        System.out.println("max=" + max);
        List<OfferOrder> resultList = list.stream().filter(offerOrder -> {
            return offerOrder.getQuantity() >= max;
        }).collect(Collectors.toList());

        System.out.println(resultList);
    }

    @Test
    public void test3() {

        //找到最大的,可能有多个
        System.out.println("1.........");
        //转换成map
        Map<Long, List<OfferOrder>> map = list.stream().collect(Collectors.groupingBy(OfferOrder::getQuantity));
        Long maxKey = map.keySet().stream().max((a, b) -> {
            return a.compareTo(b);
        }).get();
        map.get(maxKey).forEach(offerOrder -> System.out.println(offerOrder));
        System.out.println("1.........");
    }

    @Test
    public void test4() {
        //找到第一个，如果没有找到就返回null
        Optional<OfferOrder> op = list.stream().filter(offerOrder -> {
            return offerOrder.getOfferId().equals(Long.valueOf(11));
        }).findAny();
        System.out.println(op.orElse(null));
    }

    @Test
    public void test5() {
        //找到所有quantity大于2的
        List<OfferOrder> resultList = list.stream().filter(offerOrder -> {
            return offerOrder.getQuantity() > 2;
        }).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
