/**
 * FarmTest - 农场测试类
 * 
 * 本程序演示：
 * 1. 多个类之间的协作（Farmer 和 Product）
 * 2. 对象之间的交互
 * 3. 引用类型的参数传递效果
 */
public class FarmTest {
    public static void main(String[] args) {
        // 创建 Farmer 对象
        Farmer farmer = new Farmer();
        farmer.name = "王";             // 设置农民姓名
        farmer.phone = "13364554545";   // 设置农民电话
        
        // 创建 Product 对象（东北大米）
        Product rice = new Product();
        rice.name = "东北大米";          // 商品名称
        rice.price = 59.9;              // 商品价格
        rice.origin = "黑龙江";          // 产地
        rice.stock = 100;               // 初始库存
        
        // 调用 farmer 的 sellProduct 方法，尝试卖出 200 件
        // 由于库存只有 100，所以会输出"库存不足"
        farmer.sellProduct(rice, 200);
    }
}
