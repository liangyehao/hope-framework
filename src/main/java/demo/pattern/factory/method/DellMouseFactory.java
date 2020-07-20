package demo.pattern.factory.method;

import demo.pattern.factory.entity.mouse.DellMouse;
import demo.pattern.factory.entity.mouse.Mouse;

public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
