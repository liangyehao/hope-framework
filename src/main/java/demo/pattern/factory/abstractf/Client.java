package demo.pattern.factory.abstractf;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/20 21:44
 * @content
 */
public class Client {
    public static void main(String[] args) {
//        ComputerFactory computerFactory = new DellComputerFactory();
        ComputerFactory computerFactory = new HpComputerFactory();
        computerFactory.createMouse().sayHi();
        computerFactory.createKeyboard().sayHello();
    }
}
