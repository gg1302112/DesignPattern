package com.lzw.strategy_comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 16:49
 * @Description: com.lzw.strategy_comparator
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
//        Dog[] arr = {new Dog(12),new Dog(24),new Dog(36)};
        Cat[] arr = {new Cat(6,12),new Cat(4,24),new Cat(2,36)};
        Sorter s = new Sorter();
        Comparator comparator = new CatWeightComparator();
//        s.sort(arr,comparator);
        s.sort(arr,comparator);
        System.out.println(Arrays.toString(arr));
    }
}
