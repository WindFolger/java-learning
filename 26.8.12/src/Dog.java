/**
 * Dog - 狗类（实现抽象类）
 * 
 * 本类演示：
 * 1. 继承抽象类 AbstractDemo
 * 2. 使用 @Override 注解标记重写的方法
 */
public class Dog extends AbstractDemo {
    
    /**
     * 重写父类的抽象方法
     * @Override 是可选的注解，但建议加上，便于编译器检查
     */
    @Override
    public void makeSound() {
        System.out.println("wangwang");
    }
}
