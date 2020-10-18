package com.lzw.abstractfactory;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:39
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public abstract class  AbstractFactory {
    abstract Vehicle creatVehicle();
    abstract Weapon creatWeapon();
    abstract Food createFood();
}
