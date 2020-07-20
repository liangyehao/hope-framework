package demo.pattern.factory.entity.keyboard;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:42
 * @content
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是戴尔键盘");
    }
}
