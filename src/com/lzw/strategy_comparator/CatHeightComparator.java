package com.lzw.strategy_comparator;

import java.util.Comparator;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 16:54
 * @Description: com.lzw.strategy_comparator
 * @version: 1.0
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height<o2.height){
            return -1;
        }else if (o1.height>o2.height){
            return 1;
        }else{
            return 0;
        }
    }
}
