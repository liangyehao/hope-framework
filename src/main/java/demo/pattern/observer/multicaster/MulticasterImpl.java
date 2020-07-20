package demo.pattern.observer.multicaster;

import demo.pattern.observer.event.Event;
import demo.pattern.observer.listener.Listener;

public class MulticasterImpl extends AbstractMulticaster {
    @Override
    protected void afterMulticast(Listener listener, Event event) {
        System.out.println("-----广播结束-----");
    }

    @Override
    protected void beforeMulticast(Listener listener, Event event) {
        System.out.println("-----广播开始-----");
    }
}
