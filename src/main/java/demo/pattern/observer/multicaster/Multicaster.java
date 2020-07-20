package demo.pattern.observer.multicaster;

import demo.pattern.observer.event.Event;
import demo.pattern.observer.listener.Listener;

public interface Multicaster {

    void addListener(Listener listener);

    void removeListener(Listener listener);

    void multicast(Event event);

}
