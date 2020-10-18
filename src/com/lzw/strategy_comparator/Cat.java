package com.lzw.strategy_comparator;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 16:52
 * @Description: com.lzw.strategy_comparator
 * @version: 1.0
 */
public class Cat {
    int weight;
    int height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
