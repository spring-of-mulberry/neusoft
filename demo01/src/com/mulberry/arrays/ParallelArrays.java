package com.mulberry.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ParallelArrays {
    public static void main(String[] args) {
        long[] arrayofLong = new long[2000];
        Arrays.parallelSetAll( arrayofLong,
                i->ThreadLocalRandom.current().nextInt(1000000));
        Arrays.stream(arrayofLong).limit(10).forEach(i -> System.out.print(i+" "));
        System.out.println();

        Arrays.parallelSort(arrayofLong);
        Arrays.stream(arrayofLong).limit(10).forEach(i-> System.out.print(i+" "));
        System.out.println();
    }
}
