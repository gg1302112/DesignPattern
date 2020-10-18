package com.lzw.strategy_comparator;

import java.util.Comparator;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 16:40
 * @Description: com.lzw.strategy_comparator
 * @version: 1.0
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food<o2.food){
            return -1;
        }else if (o1.food>o2.food){
            return 1;
        }else{
            return 0;
        }
    }
}
