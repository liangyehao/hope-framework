package demo.pattern.observer.listener;

import demo.pattern.observer.event.Event;
import demo.pattern.observer.event.SnowEvent;

public class SnowListener extends AbstractWeatherListener {
    @Override
    protected void onWeatherEvent(Event event) {
        if(event instanceof SnowEvent){
            System.out.println("the weather is "+event.getEventName());
        }
    }
}
