/**
 * AnimalFarm - 动物农场类
 * 
 * 本类演示多态在实际开发中的应用：
 * 
 * feed 方法接收 AnimalV2 类型参数，
 * 可以传入 Dog、Cat 等任何 AnimalV2 的子类对象。
 * 
 * 这就是多态的威力：
 * - 编写代码时不需要知道具体是什么动物
 * - 运行时自动调用对应子类的 eat 方法
 * - 新增动物类型不需要修改 feed 方法
 */
public class AnimalFarm {
    
    /**
     * feed 方法：喂养动物
     * 
     * @param a AnimalV2 类型或其子类对象
     *          运行时根据实际对象类型调用对应的 eat 方法
     */
    public static void feed(AnimalV2 a) {
        a.eat();
    }
}
