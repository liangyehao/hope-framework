package demo.pattern.factory.method;

import demo.pattern.factory.entity.mouse.HpMouse;
import demo.pattern.factory.entity.mouse.Mouse;

public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
