package com.lzw.singleton1;

/**
 * @Auther: lzw
 * @Date: 20/10/16 - 10 - 16 - 21:53
 * @Description: com.lzw.singleton1
 * @version: 1.0
 */
public class SingletonMgr04 {
    private static SingletonMgr04 INSTANCE;
    private SingletonMgr04(){}

    public static synchronized SingletonMgr04 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingletonMgr04();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(SingletonMgr04.getInstance().hashCode());
            }).start();
        }
    }
}
