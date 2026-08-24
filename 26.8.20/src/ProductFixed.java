import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

/**
 * ProductFixed - 重写 equals 和 hashCode 的商品类
 * 
 * 本类演示：
 * 1. equals 方法重写：定义"内容相同"的判断标准
 * 2. hashCode 方法重写：与 equals 保持一致
 * 3. HashSet 正确去重
 * 
 * equals 和 hashCode 的契约：
 * 1. 如果两个对象 equals 为 true，则 hashCode 必须相同
 * 2. 如果 hashCode 相同，equals 不一定为 true（哈希冲突）
 * 
 * IDE 自动生成：
 * - IntelliJ IDEA 可以自动生成 equals 和 hashCode 方法
 * - 快捷键：Alt + Insert → equals() and hashCode()
 */
public class ProductFixed {
    private int id;
    private String name;
    private double price;
    
    /**
     * 构造器
     */
    public ProductFixed(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    // ========== Getter 和 Setter ==========
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 重写 equals 方法：当 id、name、price 都相同时视为同一对象
     */
    public boolean equals(Object o) {
        // 1. 同一引用，直接返回 true
        if (this == o) return true;
        
        // 2. 空对象或类型不同，返回 false
        if (o == null || getClass() != o.getClass()) return false;
        
        // 3. 类型转换后比较字段
        ProductFixed that = (ProductFixed) o;
        return id == that.id 
            && Double.compare(that.price, price) == 0 
            && name.equals(that.name);
    }
    
    /**
     * 重写 hashCode 方法：使用 Objects.hash 生成哈希码
     * 确保 equals 为 true 时 hashCode 也相同
     */
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    /**
     * 重写 toString 方法
     */
    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price;
    }
    
    /**
     * 测试方法
     */
    public static void main(String[] args) {
        Set<ProductFixed> set = new HashSet<>();
        
        // 创建两个内容相同的对象
        ProductFixed p1 = new ProductFixed(1, "IP", 50);
        ProductFixed p2 = new ProductFixed(1, "IP", 50);
        ProductFixed p3 = new ProductFixed(2, "MB", 50);
        
        set.add(p1);
        set.add(p2);  // 由于重写了 equals 和 hashCode，p2 不会添加
        set.add(p3);
        
        // 输出大小：3（p1 和 p2 被视为同一元素）
        System.out.println(set.size());
        
        // 遍历输出
        for (ProductFixed p : set) {
            System.out.println(p);
        }
    }
}
