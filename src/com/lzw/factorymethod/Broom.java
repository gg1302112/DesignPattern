package com.lzw.factorymethod;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:26
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public class Broom implements Moveable {

    @Override
    public void go(){
        System.out.println("扫帚起飞，sousousousou~~~~");
    }
}
