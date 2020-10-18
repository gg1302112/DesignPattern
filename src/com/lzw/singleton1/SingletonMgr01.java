package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 19:46
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr01 {
    private static SingletonMgr01 INSTANCE = new SingletonMgr01();
    private SingletonMgr01(){};
    public static SingletonMgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonMgr01 s1 = SingletonMgr01.getInstance();
        SingletonMgr01 s2 = SingletonMgr01.getInstance();
        System.out.println(s1 == s2);
    }
}
