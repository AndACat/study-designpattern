package life.wangzhen.designpattern.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Subject<T> {
    private static final AtomicInteger atomicInteger = new AtomicInteger();
    private static final ExecutorService executorService =
            Executors.newFixedThreadPool(5, (runnable) -> new Thread(runnable, "观察者线程" +atomicInteger.getAndIncrement()));
    private final List<IObserver<T>> observerList = new ArrayList<>();

    public void register(IObserver<T> observer){
        this.observerList.add(observer);
    }

    public void publishEvent(Event<T> event){
        // 当发布了一个事件后，提交给所有观察者
        for (IObserver<T> observer : observerList) {
            executorService.execute(() -> {
                observer.listener(event);
            });
        }
    }

    public void shutdown(){
        executorService.shutdown();
    }
}
