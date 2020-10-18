package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 21:59
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr05 {
    private static SingletonMgr05 INSTANCE;
    private SingletonMgr05(){}

    public static SingletonMgr05 getInstance(){
        if (INSTANCE==null){
            synchronized (SingletonMgr05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new SingletonMgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(SingletonMgr05.getInstance().hashCode());
            }).start();
        }
    }
}
