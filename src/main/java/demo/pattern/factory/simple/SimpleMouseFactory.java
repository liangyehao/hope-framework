package demo.pattern.factory.simple;

import demo.pattern.factory.entity.mouse.DellMouse;
import demo.pattern.factory.entity.mouse.HpMouse;
import demo.pattern.factory.entity.mouse.LenovoMouse;
import demo.pattern.factory.entity.mouse.Mouse;

public class SimpleMouseFactory {
    public static Mouse createMouse(String type){
        switch (type){
            case "dell": return new DellMouse();
            case "hp": return new HpMouse();
            // 增加产品时需要改动工厂类
            case "lenovo": return new LenovoMouse();
            default: return null;
        }
    }
}
