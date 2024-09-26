package life.wangzhen.designpattern.creationalpatterns.singleton;

public class LazySingletonClientTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            LazySingleton singleton = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + "--> " + singleton);
        };

        // 启动十个线程，让每个线程都获得单例对象，并打印
        // 用于模拟在多线程并发的情况下，获得的单例对象是否相同
        for (int i = 0; i < 10; i++) {
            new Thread(runnable, "线程" + i).start();
        }

        // 等待主线程2秒钟，让所有子线程能执行完，并打印结果
        Thread.sleep(2000L);
    }
}
