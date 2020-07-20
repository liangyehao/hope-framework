package demo.pattern.observer.event;

public class RainEvent extends AbstractWeatherEvent{
    @Override
    protected String getWeatherName() {
        return "rain";
    }
}
