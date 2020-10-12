package singleton;

/**
 * 减小同步代码块，但是行不通
 * 当第一个线程来了执行完判断，没拿到锁，但是第二线程来了拿到了锁，这样第二个线程获取到了实例
 * 然后第一个线程拿到锁，这样也就又创建了一个实例
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05(){}

    public static Mgr05 getInstance(){
        if (INSTANCE==null){
            synchronized (Mgr05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
