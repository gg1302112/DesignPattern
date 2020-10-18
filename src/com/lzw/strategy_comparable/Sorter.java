package com.lzw.strategy_comparable;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 14:31
 * @Description: com.lzw.strategy
 * @version: 1.0
 */
public class Sorter {
    public void sort(Dog[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int minPos = i;
            for (int j=i+1;j<arr.length;j++){
                minPos = arr[j].compareTo(arr[minPos]) <0? j:minPos;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(Dog[] arr,int i,int minPos) {
        Dog temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;

    }
}
