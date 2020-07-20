package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.keyboard.Keyboard;
import demo.pattern.factory.entity.mouse.Mouse;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:42
 * @content
 */
public interface ComputerFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
