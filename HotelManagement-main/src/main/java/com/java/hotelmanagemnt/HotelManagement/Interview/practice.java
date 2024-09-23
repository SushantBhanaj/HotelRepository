package com.java.hotelmanagemnt.HotelManagement.Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class practice {
    public static void main(String[] args) {
        String list = "ilovejavatechei";
        List<String> collect = Arrays.stream(list.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect);
    }
}
