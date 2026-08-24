/**
 * AnimalTestV2 - 多态测试类
 * 
 * 本程序演示多态（Polymorphism）的核心概念：
 * 
 * 1. 向上转型（Upcasting）：
 *    AnimalV2 a = new Dog("大黄", 13);
 *    父类引用指向子类对象，安全且自动
 * 
 * 2. 动态绑定（Dynamic Binding）：
 *    a.eat();  // 运行时根据实际对象类型调用 Dog 的 eat 方法
 * 
 * 3. 多态的好处：
 *    - 代码扩展性好：新增动物类型不需要修改 feed 方法
 *    - 代码复用性高：统一接口处理不同类型的对象
 */
public class AnimalTestV2 {
    public static void main(String[] args) {
        // 向上转型：父类引用指向 Dog 对象
        AnimalV2 a = new Dog("大黄", 13);
        
        // 动态绑定：虽然 a 是 AnimalV2 类型，但实际调用 Dog 的 eat 方法
        a.eat();
        a.sleep();  // 调用继承自 AnimalV2 的方法
        
        // 向上转型：父类引用指向 Cat 对象
        AnimalV2 b = new Cat("咪咪", 5);
        b.eat();
        b.sleep();
        
        // 多态的实际应用：feed 方法接收 AnimalV2 类型参数
        // 可以传入任何 AnimalV2 的子类对象
        AnimalFarm.feed(a);  // 传入 Dog 对象
        AnimalFarm.feed(b);  // 传入 Cat 对象
    }
}
