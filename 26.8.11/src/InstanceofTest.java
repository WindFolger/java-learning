/**
 * InstanceofTest - instanceof 运算符演示
 * 
 * 本程序演示：
 * 1. 向下转型（Downcasting）：将父类引用转为子类引用
 * 2. instanceof 运算符：判断对象是否是指定类型的实例
 * 
 * 向下转型的风险：
 * - 如果转型类型不匹配，会抛出 ClassCastException
 * - 所以转型前通常先用 instanceof 检查
 * 
 * 安全转型模式：
 * if (a instanceof Dog) {
 *     Dog d = (Dog) a;
 *     d.WatchDoor();
 * }
 */
public class InstanceofTest {
    public static void main(String[] args) {
        // 向上转型：AnimalV2 引用指向 Dog 对象
        AnimalV2 a = new Dog("小黄", 5);
        AnimalV2 b = new Cat("小咪", 4);
        
        // 向下转型：将 AnimalV2 引用转为 Dog 引用
        // 需要强制类型转换：(Dog) a
        Dog d = (Dog) a;
        
        // 现在可以调用 Dog 类特有的 WatchDoor 方法
        // 注意：如果 a 实际指向 Cat 对象，转型会抛出异常
        d.WatchDoor();
        
        // 将 b 向下转型为 Cat
        Cat c = (Cat) b;
        c.eat();
    }
}
