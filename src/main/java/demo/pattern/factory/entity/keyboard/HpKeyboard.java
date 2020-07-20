package demo.pattern.factory.entity.keyboard;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:46
 * @content
 */
public class HpKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是惠普键盘");
    }
}
