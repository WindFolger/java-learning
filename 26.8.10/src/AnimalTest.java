/**
 * AnimalTest - 继承测试类
 * 
 * 本程序演示：
 * 1. 创建子类对象
 * 2. 调用继承自父类的方法
 * 3. 调用子类特有的方法
 * 4. 继承链中的方法调用
 */
public class AnimalTest {
    public static void main(String[] args) {
        // 创建 Dog 对象，传入名称和年龄
        Dog dog = new Dog("dahuang", 10);
        
        // 调用继承自 Animal 的方法
        dog.eat();        // 实际调用 Dog 类重写的 eat 方法
        dog.sleep();      // 调用 Animal 类的 sleep 方法
        
        // 调用 Dog 类特有的方法
        dog.watchdoor();
        
        // 创建 Cat 对象
        Cat cat = new Cat("mimi", 2);
        
        // 调用继承和重写的方法
        cat.eat();
        cat.sleep();
        
        // 调用 Cat 类特有的方法
        cat.catchMouse();
    }
}
