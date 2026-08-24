/**
 * Product - 商品类（26.8.19 版本）
 * 
 * 用于 HashSet 演示的简化版商品类。
 * 注意：此版本未重写 equals 和 hashCode，
 * 所以 HashSet 会按引用比较，相同内容的对象被视为不同元素。
 */
public class Product {
    private int id;
    private String name;
    private double price;
    
    /**
     * 构造器
     * @param id 商品编号
     * @param name 商品名称
     * @param price 商品价格
     */
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    /**
     * 重写 toString 方法便于输出
     */
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
