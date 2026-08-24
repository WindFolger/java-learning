/**
 * GoodsTest - 商品继承测试
 * 
 * 本程序演示：
 * 1. 创建子类对象
 * 2. 调用重写的方法
 * 3. 继承链中的方法调用效果
 */
public class GoodsTest {
    public static void main(String[] args) {
        // 创建 ProductV3 对象，传入所有参数
        // 构造器调用链：ProductV3 构造器 → Goods 构造器
        ProductV3 p = new ProductV3("iPhone 16", 5999.0, "中国", 100);
        
        // 调用重写的 getInfo 方法，输出包含产地和库存的完整信息
        System.out.println(p.getInfo());
    }
}
