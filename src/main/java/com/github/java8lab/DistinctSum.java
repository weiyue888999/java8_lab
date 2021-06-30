package com.github.java8lab;

import com.github.common.OfferOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctSum {

    public static void main(String[] args) {
        List<OfferOrder> list = new ArrayList<>();
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

        //merge !!!!
        List<OfferOrder> result = list.stream()
                .collect(Collectors.toMap(OfferOrder::getOfferId, Function.identity(), (oldVal, newVal) -> {
                    oldVal.setSignQuantity(oldVal.getSignQuantity() + newVal.getSignQuantity());
                    oldVal.setQuantity(oldVal.getQuantity() + newVal.getQuantity());
                    return oldVal;
                })).values().stream().collect(Collectors.toList());
        System.out.println(result);

        List<OfferOrder> ll = list.stream()
                .collect(Collectors.toMap(OfferOrder::getOfferId, Function.identity(), (oldVal, newVal) -> {
                    return oldVal;
                })).values().stream().collect(Collectors.toList());
        System.out.println(ll);
    }
}
