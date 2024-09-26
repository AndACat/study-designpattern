package life.wangzhen.designpattern.behavioralpatterns.observer.observers;

import life.wangzhen.designpattern.behavioralpatterns.observer.Event;
import life.wangzhen.designpattern.behavioralpatterns.observer.IObserver;

import java.util.concurrent.TimeUnit;

public class DaughterObserver implements IObserver<String> {
    @Override
    public void listener(Event<String> event) {
        String message = event.getMessage();
        System.out.println("当前的线程是：" + Thread.currentThread().getName() + ", 女儿收到妈妈做好饭的消息了： " + message + ", 女儿去拿碗了~");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
