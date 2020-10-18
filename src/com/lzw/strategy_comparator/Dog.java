package com.lzw.strategy_comparator;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 16:41
 * @Description: com.lzw.strategy_comparator
 * @version: 1.0
 */
public class Dog {
    int food;

    public Dog(int food){
        this.food=food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
