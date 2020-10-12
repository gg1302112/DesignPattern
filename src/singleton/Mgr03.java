package singleton;

/**
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题，多线程是容易创建多个实例
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03(){};

    public static Mgr03 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->{System.out.println(Mgr03.getInstance().hashCode());}).start();
        }
    }

}
