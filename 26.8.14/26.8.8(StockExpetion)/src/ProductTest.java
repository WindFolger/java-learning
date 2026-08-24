/**
 * ProductTest - 商品测试（26.8.14 版本）
 * 
 * 与 26.8.8 版本相同的测试类。
 */
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "东北大米";
        p1.price = 59.9;
        p1.stock = 100;
        p1.origin = "黑龙江";
        p1.printInfo();
        
        Product p2 = new Product();
        p2.name = "红富士苹果";
        p2.price = 8.8;
        p2.origin = "山东";
        p2.stock = 200;
        p2.printInfo();
        
        Product p3 = new Product();
        p3.name = "巨峰葡萄";
        p3.price = 15.5;
        p3.origin = "辽宁";
        p3.stock = 150;
        p3.printInfo();
    }
}
