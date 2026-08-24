/**
 * Test - 接口测试类
 * 
 * 本程序演示：
 * 1. 创建实现接口的对象
 * 2. 调用接口中定义的方法
 * 3. 一个对象可以同时拥有多种能力（多个接口的方法）
 */
public class Test {
    public static void main(String[] args) {
        // 创建 Duck 对象
        Duck duck = new Duck();
        
        // 调用 Flyable 接口的方法
        duck.fly();
        
        // 调用 Swimmable 接口的方法
        duck.swim();
    }
}
