package demo.pattern.observer.event;

public class SnowEvent extends AbstractWeatherEvent {
    @Override
    protected String getWeatherName() {
        return "snow";
    }
}
