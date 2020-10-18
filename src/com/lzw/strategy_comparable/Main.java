package com.lzw.strategy_comparable;

import java.util.Arrays;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 15:28
 * @Description: com.lzw.strategy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Dog[] arr = {new Dog(12),new Dog(2),new Dog(25)};
        Sorter s = new Sorter();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
