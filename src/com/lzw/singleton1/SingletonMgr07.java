package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 22:23
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr07 {

    private SingletonMgr07(){}

    private static class Mgr07Hander{
        private static SingletonMgr07 INSTANCE = new SingletonMgr07();
    }

    public static SingletonMgr07 getInstance(){
        return Mgr07Hander.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(SingletonMgr07.getInstance().hashCode());
            }).start();

        }
    }
}
