/**
 * Dog - 狗类（继承 Animal）
 * 
 * 本类演示：
 * 1. 继承（Inheritance）：使用 extends 关键字继承父类
 * 2. 构造器调用：使用 super() 调用父类构造器
 * 3. 方法重写（Override）：子类重新实现父类的方法
 * 4. 子类特有的方法
 * 
 * 继承的好处：
 * - 代码复用：子类自动拥有父类的属性和方法
 * - 扩展性：可以在子类中添加新的属性和方法
 * - 多态性：为后续多态编程奠定基础
 */
public class Dog extends Animal {
    
    /**
     * 构造器：调用父类构造器初始化 name 和 age
     * super(name, age) 必须位于构造器的第一行
     * 
     * @param name 狗的名称
     * @param age 狗的年龄
     */
    public Dog(String name, int age) {
        super(name, age);
    }
    
    /**
     * 重写父类的 eat 方法
     * 子类可以根据自身特点改变父类的行为
     */
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
    
    /**
     * Dog 类特有的方法：看门
     * 只有 Dog 对象才能调用此方法
     */
    public void watchdoor() {
        System.out.println(getName() + "看门");
    }
}
