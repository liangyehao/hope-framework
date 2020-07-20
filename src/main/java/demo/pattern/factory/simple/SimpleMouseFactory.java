package demo.pattern.factory.simple;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;

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
