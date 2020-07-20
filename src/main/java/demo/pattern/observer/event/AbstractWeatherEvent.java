package demo.pattern.observer.event;

public abstract class AbstractWeatherEvent implements Event{
    @Override
    public String getEventName() {
        return getWeatherName();
    }

    protected abstract String getWeatherName();

}
