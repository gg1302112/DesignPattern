package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 19:49
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr02 {
    private static SingletonMgr02 INSTANCE;

    private SingletonMgr02(){

    }

    static {
        INSTANCE = new SingletonMgr02();
    }

    public static SingletonMgr02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonMgr02 s1 = SingletonMgr02.getInstance();
        SingletonMgr02 s2 = SingletonMgr02.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }



}
