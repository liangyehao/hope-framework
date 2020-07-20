package demo.pattern.factory.simple;

import demo.pattern.factory.entity.mouse.Mouse;


/**
 * 简单工厂模式
 *
 *  优点：
 *      1.Mouse产品符合开闭原则，扩展时只需要增加Mouse子类，不需要改动原有的类
 *      2.简单工厂对客户端隐藏了对象创建细节（迪米特原则，最少知道原则）
 *
 *  缺点:
 *      简单工厂不合符开闭原则，扩展新产品（如：联想鼠标时），必须修改简单工厂类
 *
 * @author liangyehao
 * @date 2020/07/20
 */
public class Client {
    public static void main(String[] args) {
        Mouse mouse = SimpleMouseFactory.createMouse("lenovo");
        assert mouse != null;
        mouse.sayHi();
    }
}
