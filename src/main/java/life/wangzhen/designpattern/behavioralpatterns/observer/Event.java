package life.wangzhen.designpattern.behavioralpatterns.observer;

import lombok.Getter;

import java.util.Date;

public class Event<T> {
    @Getter
    private T message;
    private Date publishEvent = new Date();

    public Event(T message) {
        this.message = message;
    }

}
