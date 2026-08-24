/**
 * Duck - 鸭子类（实现多个接口）
 * 
 * 本类演示：
 * 1. 使用 implements 实现接口
 * 2. 一个类可以实现多个接口（用逗号分隔）
 * 3. 实现接口的所有方法
 * 
 * 多重接口实现是 Java 实现多重继承的方式：
 * Duck 既有 Flyable 的飞行能力，又有 Swimmable 的游泳能力
 */
public class Duck implements Flyable, Swimmable {
    
    /**
     * 实现 Swimmable 接口的 swim 方法
     */
    public void swim() {
        System.out.println("Swimmable");
    }
    
    /**
     * 实现 Flyable 接口的 fly 方法
     */
    public void fly() {
        System.out.println("Flying");
    }
}
