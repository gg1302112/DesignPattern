package com.lzw.factorymethod;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:27
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Moveable m = new SimpleVehicleFactory().creatCar();
        m.go();
    }
}
