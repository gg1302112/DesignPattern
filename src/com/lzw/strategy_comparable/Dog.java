package com.lzw.strategy_comparable;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 15:37
 * @Description: com.lzw.strategy
 * @version: 1.0
 */
public class Dog implements Comparable<Dog> {
    int food;

    public Dog(int food){
        this.food = food;
    }

    @Override
    public int compareTo(Dog o) {
        if (this.food<o.food){
            return -1;
        }else if(this.food>o.food){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
