/**
 * AbstractTest - 抽象类测试
 * 
 * 本程序演示：
 * 1. 使用父类引用指向子类对象（多态）
 * 2. 抽象类的实际应用场景
 * 
 * 虽然不能 new AbstractDemo()，但可以：
 * AbstractDemo cat = new Cat();
 * 这是因为 cat 引用实际指向的是 Cat 对象
 */
public class AbstractTest {
    public static void main(String[] args) {
        // 父类引用指向 Cat 对象
        AbstractDemo cat = new Cat();
        cat.makeSound();  // 调用 Cat 类的 makeSound 方法
        
        // 父类引用指向 Dog 对象
        AbstractDemo dog = new Dog();
        dog.makeSound();  // 调用 Dog 类的 makeSound 方法
    }
}
