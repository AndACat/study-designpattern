package life.wangzhen.designpattern.behavioralpatterns.observer.observers;

import life.wangzhen.designpattern.behavioralpatterns.observer.Event;
import life.wangzhen.designpattern.behavioralpatterns.observer.IObserver;

import java.util.concurrent.TimeUnit;

public class DadObserver implements IObserver<String> {
    @Override
    public void listener(Event<String> event) {
        String message = event.getMessage();
        System.out.println("当前的线程是：" + Thread.currentThread().getName() + ", 爸爸收到老婆做好饭的消息了： " + message + ", 爸爸去端饭了~~~");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
