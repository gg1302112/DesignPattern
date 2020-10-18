package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 20:27
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr03 {
    private static SingletonMgr03 INSTANCE;

    private SingletonMgr03(){}

    public static SingletonMgr03 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingletonMgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{System.out.println(SingletonMgr03.getInstance().hashCode());}).start();
        }
    }
}
