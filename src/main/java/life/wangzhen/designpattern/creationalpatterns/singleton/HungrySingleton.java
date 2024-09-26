package life.wangzhen.designpattern.creationalpatterns.singleton;

public final class HungrySingleton {
    // 饿汉式，提前加载示例
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    // 通过构造器私有的方式，堵住new实例方法, 防止外部创建该对象
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
