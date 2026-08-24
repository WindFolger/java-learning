/**
 * Cat - 猫类 V2（继承 AnimalV2）
 * 
 * 本类演示：
 * 1. 继承和多态
 * 2. 方法重写
 * 3. 子类特有方法 catchMouse
 */
public class Cat extends AnimalV2 {
    
    /**
     * 构造器
     * @param name 猫的名称
     * @param age 猫的年龄
     */
    public Cat(String name, int age) {
        super(name, age);
    }
    
    /**
     * 重写父类的 eat 方法
     */
    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish");
    }
    
    /**
     * Cat 特有方法：捉老鼠
     */
    public void catchMouse() {
        System.out.println(getName() + " is catching mouse");
    }
}
