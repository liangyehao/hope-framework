package demo.pattern.observer.listener;

import demo.pattern.observer.event.Event;

public interface Listener {
    void onEvent(Event event);
}
