package demo.pattern.factory.method;

import demo.pattern.factory.entity.mouse.LenovoMouse;
import demo.pattern.factory.entity.mouse.Mouse;

public class LenovoMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
