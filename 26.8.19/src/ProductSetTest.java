import java.util.HashSet;
import java.util.Set;

/**
 * ProductSetTest - HashSet 对象去重测试
 * 
 * 本程序演示：
 * 当自定义对象存入 HashSet 时，
 * 如果没有重写 equals 和 hashCode 方法，
 * 即使两个对象内容相同，也会被视为不同元素。
 * 
 * 原因：
 * - HashSet 通过 hashCode 确定存储位置
 * - 通过 equals 判断是否重复
 * - 默认 hashCode 返回对象内存地址
 * - 默认 equals 比较对象引用
 * 
 * 解决方案：重写 equals 和 hashCode（见 ProductFixed 类）
 */
public class ProductSetTest {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        
        // 创建两个内容相同的 Product 对象
        Product p1 = new Product(1, "IP", 566);
        Product p2 = new Product(1, "IP", 566);
        
        // 添加到 HashSet
        set.add(p1);
        set.add(p2);
        
        // 输出大小：由于没有重写 equals/hashCode，结果为 2
        System.out.println(set.size());
        System.out.println(set);
    }
}
