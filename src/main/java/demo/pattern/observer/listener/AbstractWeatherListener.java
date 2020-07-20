package demo.pattern.observer.listener;

import demo.pattern.observer.event.Event;

public abstract class AbstractWeatherListener implements Listener {
    @Override
    public void onEvent(Event event) {
        onWeatherEvent(event);
    }

    protected abstract void onWeatherEvent(Event event);

}
