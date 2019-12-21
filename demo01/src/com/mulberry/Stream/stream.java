package com.mulberry.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        Integer[] str  = {2,13,14,16,23,25,15,26};
        Stream<Integer> integer = Stream.of(str);
        integer.forEach(System.out::println);

    }
}
