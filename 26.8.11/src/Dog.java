/**
 * Dog - 狗类 V2（继承 AnimalV2）
 * 
 * 本类演示：
 * 1. 继承和多态
 * 2. 方法重写（@Override 注解）
 * 3. 子类特有方法
 * 
 * 多态的体现：
 * AnimalV2 a = new Dog("小黄", 5);  // 父类引用指向子类对象
 * a.eat();  // 实际调用 Dog 类的 eat 方法
 */
public class Dog extends AnimalV2 {
    
    /**
     * 构造器
     * @param name 狗的名称
     * @param age 狗的年龄
     */
    public Dog(String name, int age) {
        super(name, age);
    }
    
    /**
     * 重写父类的 eat 方法
     * @Override 注解告诉编译器检查此方法是否确实重写了父类方法
     */
    @Override
    public void eat() {
        System.out.println(getName() + " is eating bone");
    }
    
    /**
     * Dog 特有方法：看门
     * 注意：父类引用无法直接调用子类特有方法，需要向下转型
     */
    public void WatchDoor() {
        System.out.println(getName() + " is watching door");
    }
}
