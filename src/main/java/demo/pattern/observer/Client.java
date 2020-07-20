package demo.pattern.observer;

import demo.pattern.observer.event.Event;
import demo.pattern.observer.event.RainEvent;
import demo.pattern.observer.event.SnowEvent;
import demo.pattern.observer.listener.Listener;
import demo.pattern.observer.listener.RainListener;
import demo.pattern.observer.listener.SnowListener;
import demo.pattern.observer.multicaster.Multicaster;
import demo.pattern.observer.multicaster.MulticasterImpl;

public class Client {
    public static void main(String[] args) {

        Event rainEvent = new RainEvent(), snowEvent = new SnowEvent();

        Listener rainListener = new RainListener(),snowListener = new SnowListener();

        Multicaster multicaster = new MulticasterImpl();

        multicaster.addListener(rainListener);
        multicaster.addListener(snowListener);

//        multicaster.multicast(rainEvent);

        multicaster.removeListener(snowListener);

        multicaster.multicast(snowEvent);

    }
}
