package com.lzw.abstractfactory;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:47
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Vehicle creatVehicle() {
        return new Broom();
    }

    @Override
    Weapon creatWeapon() {
        return new MagicStick();
    }

    @Override
    Food createFood() {
        return new MushRoom();
    }
}
