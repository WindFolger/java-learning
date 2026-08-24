/**
 * ProductTest - 商品类测试
 * 
 * 本程序演示：
 * 1. 对象的创建：使用 new 关键字实例化类
 * 2. 对象属性的赋值：通过"对象.属性名"访问
 * 3. 对象方法的调用：通过"对象.方法名()"调用
 * 
 * 注意：此版本直接访问属性（包访问权限），
 * 实际开发中应使用 private 封装 + getter/setter
 */
public class ProductTest {
    public static void main(String[] args) {
        // ========== 创建第一个商品对象 ==========
        // new Product() 调用无参构造器创建对象
        // p1 是引用变量，指向堆内存中的 Product 对象
        Product p1 = new Product();
        
        // 为对象的属性赋值
        p1.name = "东北大米";    // 商品名称
        p1.price = 59.9;        // 商品价格
        p1.stock = 100;         // 库存数量
        p1.origin = "黑龙江";    // 产地
        
        // 调用对象的方法打印信息
        p1.printInfo();
        
        // ========== 创建第二个商品对象 ==========
        Product p2 = new Product();
        p2.name = "红富士苹果";
        p2.price = 8.8;
        p2.origin = "山东";
        p2.stock = 200;
        p2.printInfo();
        
        // ========== 创建第三个商品对象 ==========
        Product p3 = new Product();
        p3.name = "巨峰葡萄";
        p3.price = 15.5;
        p3.origin = "辽宁";
        p3.stock = 150;
        p3.printInfo();
    }
}
