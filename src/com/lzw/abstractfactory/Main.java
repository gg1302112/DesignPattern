package com.lzw.abstractfactory;

/**
 * @Auther: lzw
 * @Date: 20/10/18 - 10 - 18 - 19:36
 * @Description: com.lzw.abstractfactory
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args){
        AbstractFactory f = new MagicFactory();
        Food b = f.createFood();
        b.eat();
        Vehicle v = f.creatVehicle();
        v.go();
        Weapon w = f.creatWeapon();
        w.shoot();
    }
}
