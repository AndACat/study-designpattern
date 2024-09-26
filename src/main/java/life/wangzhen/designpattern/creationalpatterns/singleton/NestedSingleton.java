package life.wangzhen.designpattern.creationalpatterns.singleton;

public final class NestedSingleton {
    private NestedSingleton() {};

    // 在Holder的嵌套类中，持有外部的单例实例对象
    // 并且jvm只在客户端调用getInstance()方法时，才会初始化NestedSingletonHolder类，
    // 进而才会加载对象，从而巧妙地实现了懒加载
    private static class NestedSingletonHolder{
        static {
            // 在静态代码块中打印JVM第一次加载类的时间
            System.out.println("JVM加载NestedSingletonHolder的时间：" + System.currentTimeMillis());
        }
        private final static NestedSingleton INSTANCE = new NestedSingleton();
    }

    public static NestedSingleton getInstance(){
        return NestedSingletonHolder.INSTANCE;
    }
}
