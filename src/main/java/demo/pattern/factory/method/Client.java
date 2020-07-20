package demo.pattern.factory.method;

import demo.pattern.factory.entity.mouse.Mouse;

/**
 * 工厂方法模式：抽象出创建产品的方法，创建产品的实现延迟到子类进行
 * 优点：
 *      1.对客户端隐藏创建产品的细节（迪米特原则，最少知道原则）
 *      1.产品线和工厂线都符合开闭原则，扩展的时候只需要分别增加一个产品和一个对应的工厂类，不需要改动原有的代码
 * 缺点：
 *      1.产品增加的时候工厂类也要对应增加，类爆炸
 *      2.只能创建单一的产品
 *
 * @author liangyehao
 * @date 2020/07/20
 */
public class Client {
    public static void main(String[] args) {
//        MouseFactory mf = new HpMouseFactory();
//        MouseFactory mf = new DellMouseFactory();
        MouseFactory mf = new LenovoMouseFactory();
        Mouse mouse = mf.createMouse();
        mouse.sayHi();
    }
}
