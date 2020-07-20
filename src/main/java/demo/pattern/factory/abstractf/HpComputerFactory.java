package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.keyboard.HpKeyboard;
import demo.pattern.factory.entity.keyboard.Keyboard;
import demo.pattern.factory.entity.mouse.HpMouse;
import demo.pattern.factory.entity.mouse.Mouse;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:45
 * @content
 */
public class HpComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
