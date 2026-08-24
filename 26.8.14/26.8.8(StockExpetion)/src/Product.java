/**
 * Product - 商品类（26.8.14 版本）
 * 
 * 与 26.8.8 版本相同的商品类，
 * 用于配合自定义异常演示。
 */
public class Product {
    /** 商品名称 */
    String name;
    /** 商品价格 */
    double price;
    /** 商品产地 */
    String origin;
    /** 商品库存 */
    int stock;
    
    /**
     * 打印商品信息
     */
    public void printInfo() {
        System.out.println(name + " " + price + " " + origin + " " + stock);
    }
}
