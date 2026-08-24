/**
 * Cat - 猫类（继承 Animal）
 * 
 * 本类演示：
 * 1. 继承 Animal 父类
 * 2. 调用父类构造器
 * 3. 重写 eat 方法
 * 4. 子类特有方法 catchMouse
 */
public class Cat extends Animal {
    
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
     * 猫吃鱼而不是普通地"吃东西"
     */
    public void eat() {
        System.out.println(getName() + "在吃鱼");
    }
    
    /**
     * Cat 类特有的方法：捉老鼠
     */
    public void catchMouse() {
        System.out.println(getName() + "捉老鼠");
    }
}
