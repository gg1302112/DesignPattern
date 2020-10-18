package com.lzw.abstractfactory;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:48
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Vehicle creatVehicle() {
        return new Car();
    }

    @Override
    Weapon creatWeapon() {
        return new AK47();
    }

    @Override
    Food createFood() {
        return new Bread();
    }
}
