package life.wangzhen.designpattern.creationalpatterns.singleton;

public class LazySingleton {
    // 需要用volatile声明，保证内存可见性
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    // 通过懒加载+双重检查锁+内存可见性结合的方式，实现了懒汉式单例模型
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
