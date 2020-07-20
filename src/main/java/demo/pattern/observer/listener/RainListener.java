package demo.pattern.observer.listener;

import demo.pattern.observer.event.Event;
import demo.pattern.observer.event.RainEvent;

public class RainListener extends AbstractWeatherListener {
    @Override
    protected void onWeatherEvent(Event event) {
        if (event instanceof RainEvent) {
            System.out.println("the weather is "+event.getEventName());
        }

    }
}
