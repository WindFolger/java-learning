/**
 * Goods - 商品基类
 * 
 * 本类演示：
 * 1. 类的封装：属性 + 构造器 + 方法
 * 2. 有参构造器的定义
 * 3. 方法返回字符串信息
 * 
 * 作为父类，为 ProductV3 提供基础属性和功能
 */
public class Goods {
    /** 商品名称 */
    String name;
    
    /** 商品价格 */
    double price;

    /**
     * 有参构造器：创建商品时初始化名称和价格
     * 
     * @param name 商品名称
     * @param price 商品价格
     */
    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * getInfo 方法：返回商品基本信息
     * 
     * @return 格式化的商品信息字符串
     */
    public String getInfo() {
        return "商品名称：" + name + "，价格：" + price + "元";
    }
}
