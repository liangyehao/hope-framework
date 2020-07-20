package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.keyboard.DellKeyboard;
import demo.pattern.factory.entity.keyboard.Keyboard;
import demo.pattern.factory.entity.mouse.DellMouse;
import demo.pattern.factory.entity.mouse.Mouse;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:43
 * @content
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
