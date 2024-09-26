package life.wangzhen.designpattern.behavioralpatterns.observer;

import life.wangzhen.designpattern.behavioralpatterns.observer.observers.DadObserver;
import life.wangzhen.designpattern.behavioralpatterns.observer.observers.DaughterObserver;
import life.wangzhen.designpattern.behavioralpatterns.observer.observers.SonObserver;
import java.util.concurrent.TimeUnit;

public class ObserverClientTest {
    public static void main(String[] args) throws InterruptedException {
        IObserver<String> dadObserver = new DadObserver();
        IObserver<String> sonObserver = new SonObserver();
        IObserver<String> daughterObserver = new DaughterObserver();

        // 先创建一个发布消息的流转中心
        Subject<String> subject = new Subject<>();
        // 注册消息的观察者
        subject.register(dadObserver);
        subject.register(sonObserver);
        subject.register(daughterObserver);

        System.out.println("妈妈开始发布消息： " + System.currentTimeMillis());
        // 妈妈做好饭了，发布消息
        subject.publishEvent(new Event<>("妈妈做好早饭了，你们都准备吃饭吧~"));

        subject.publishEvent(new Event<>("妈妈做好午饭了，你们都准备吃饭吧~"));

        subject.publishEvent(new Event<>("妈妈做好晚饭了，你们都准备吃饭吧~"));

        System.out.println("妈妈结束发布消息： " + System.currentTimeMillis());

        // 优雅方式关闭线程池，让所有线程执行完，再真正关闭
        subject.shutdown();

    }
}
