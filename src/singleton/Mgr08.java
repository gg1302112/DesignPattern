package singleton;

/**
 * 不仅可以解决线程同步问题，还可以解决序列化
 */
public enum Mgr08 {
    INSTANCE("hello");


    private String name;
    private Mgr08(String name){
        this.name = name;
    }

    public void m(){
        System.out.println("m");
    }

    @Override
    public String toString() {
        return "Mgr08{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args){
//        for (int i = 0; i <100 ; i++) {
//            new Thread(()->{
//                System.out.println(Mgr08.INSTANCE.hashCode());
//            }).start();
//        }
        System.out.println(Mgr08.INSTANCE);
        Mgr08.INSTANCE.m();
    }
}
