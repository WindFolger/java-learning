/**
 * Product - 商品类（面向对象入门版本）
 * 
 * 本类演示：
 * 1. 类的定义：类是对象的模板，包含属性（数据）和方法（行为）
 * 2. 成员变量（属性）：描述对象的特征
 * 3. 成员方法：描述对象的行为
 * 
 * 面向对象核心概念：
 * - 类（Class）：抽象的模板
 * - 对象（Object）：类的具体实例
 * - 属性：对象的状态/数据
 * - 方法：对象的行为/功能
 */
public class Product {
    // 成员变量（实例变量）：每个对象都有自己的一份副本
    
    /** 商品名称 */
    String name;
    
    /** 商品价格 */
    double price;
    
    /** 商品产地 */
    String origin;
    
    /** 商品库存数量 */
    int stock;
    
    /**
     * printInfo 方法：打印商品信息
     * 成员方法可以访问当前对象的成员变量
     */
    public void printInfo() {
        // 使用 + 号拼接字符串输出商品的所有属性
        System.out.println(name + " " + price + " " + origin + " " + stock);
    }
}
