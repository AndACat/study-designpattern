package life.wangzhen.designpattern.behavioralpatterns.observer;

public interface IObserver<T> {
    void listener(Event<T> event);
}
