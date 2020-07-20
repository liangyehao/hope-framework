package demo.pattern.observer.multicaster;

import demo.pattern.observer.event.Event;
import demo.pattern.observer.listener.Listener;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMulticaster implements Multicaster{

    private final List<Listener> listenerList = new ArrayList<>();

    @Override
    public void addListener(Listener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        listenerList.remove(listener);
    }

    @Override
    public void multicast(Event event) {
        listenerList.forEach(
                listener -> {
                    beforeMulticast(listener,event);
                    listener.onEvent(event);
                    afterMulticast(listener,event);
                }
        );
    }

    protected abstract void afterMulticast(Listener listener, Event event);

    protected abstract void beforeMulticast(Listener listener, Event event);
}
