/**
 * Product - 商品类（26.8.24 版本）
 * 
 * 用于泛型和集合排序演示的商品类。
 */
public class Product {
    private String name;
    private double price;
    
    /**
     * 构造器
     * @param name 商品名称
     * @param price 商品价格
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
}
