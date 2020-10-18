package com.lzw.factorymethod;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:32
 * @Description: com.lzw.factorymethod
 * @version: 1.0
 */
public class SimpleVehicleFactory {

    public Car creatCar(){
        System.out.println("create a car");
        return new Car();
    }

    public Broom createBroom(){
        System.out.println("create a broom");
        return new Broom();
    }
}
