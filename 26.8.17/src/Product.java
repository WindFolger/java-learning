/**
 * Product - 商品类（26.8.17 版本）
 * 
 * 本类用于 ArrayList 演示，
 * 包含 id、name、price 属性，以及 getter/setter 和 toString 方法。
 */
public class Product {
    private String name;
    private double price;
    int id;
    
    /**
     * 构造器
     * @param id 商品编号
     * @param name 商品名称
     * @param price 商品价格
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * 重写 toString 方法，便于打印对象信息
     */
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", id=" + id + '}';
    }
}
