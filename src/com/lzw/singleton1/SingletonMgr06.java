package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 22:19
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr06 {
    private static SingletonMgr06 INSTANCE;
    private SingletonMgr06(){}
    public static SingletonMgr06 getInstance(){
        if (INSTANCE==null){
            synchronized (SingletonMgr06.class){
                if (INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new SingletonMgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(SingletonMgr06.getInstance().hashCode());
            }).start();

        }
    }
}
