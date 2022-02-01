package com.company;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] a){

        for (int i = 0; i < a.length - 1; i ++) {
            if (a[i].compareTo(a[a.length - 1 - i]) < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] integers1 = {1, 3, 6, 2, 1};
        Integer[] integers2 = {1, 5, 1, 5, 1};
        LocalTime[] localTimes1 = {LocalTime.of(10, 20, 30), LocalTime.of(9, 30, 10), LocalTime.of(22, 30, 25)};
        LocalTime[] localTimes2 = {LocalTime.of(10, 20, 30), LocalTime.of(10, 20, 30)};
        System.out.println(jestPalindromem(integers1));
        System.out.println(jestPalindromem(integers2));
        System.out.println(jestPalindromem(localTimes1));
        System.out.println(jestPalindromem(localTimes2));
    }
}
