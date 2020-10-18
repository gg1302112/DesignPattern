package com.lzw.factorymethod;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 18:38
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public class Car implements Moveable{

    @Override
    public void go(){
        System.out.println("小汽车跑起来了huhuhu~~~~~");
    }
}
