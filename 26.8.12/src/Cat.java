/**
 * Cat - 猫类（实现抽象类）
 * 
 * 本类演示：
 * 1. 继承抽象类 AbstractDemo
 * 2. 实现（重写）抽象方法 makeSound
 * 
 * 如果一个类继承抽象类，它必须：
 * - 实现所有抽象方法，或者
 * - 自己也声明为抽象类
 */
public class Cat extends AbstractDemo {
    
    /**
     * 实现父类的抽象方法 makeSound
     * 必须提供方法体，否则编译报错
     */
    public void makeSound() {
        System.out.println("miaomiao");
    }
}
