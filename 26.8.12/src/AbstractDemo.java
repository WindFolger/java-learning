/**
 * AbstractDemo - 抽象类演示
 * 
 * 本类演示：
 * 1. 抽象类（abstract class）：使用 abstract 修饰的类，不能被实例化
 * 2. 抽象方法（abstract method）：只有方法签名，没有方法体
 * 3. 抽象类的作用：为子类提供统一的接口规范
 * 
 * 抽象类 vs 普通类：
 * - 抽象类可以包含抽象方法，普通类不能
 * - 抽象类不能被 new 关键字实例化
 * - 子类必须实现父类的所有抽象方法（除非子类也是抽象类）
 */
abstract class AbstractDemo {
    
    /**
     * 抽象方法：只有声明，没有实现
     * 子类必须重写此方法提供具体实现
     */
    abstract void makeSound();
}
