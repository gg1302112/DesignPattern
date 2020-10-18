package com.lzw.strategy_comparator;

import java.util.Comparator;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 16:33
 * @Description: com.lzw.strategy_comparator
 * @version: 1.0
 */
public class Sorter<T> {

    public Sorter() {
    }

    public void sort(T[] arr, Comparator comparator){
        for (int i = 0; i <arr.length ; i++) {
            int minPos=i;
            for (int j = i+1; j <arr.length ; j++) {
                minPos = comparator.compare(arr[j],arr[minPos])==-1?j:minPos;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(T[] arr, int i, int minPos) {
        T temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
