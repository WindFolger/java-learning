import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CollectionsDemo - 集合排序演示
 * 
 * 本程序演示：
 * 1. Collections.sort() 方法对 List 进行排序
 * 2. Comparator 匿名内部类自定义排序规则
 * 3. 按价格升序排列商品
 * 
 * Comparable vs Comparator：
 * - Comparable：在类内部实现，定义"自然排序"
 * - Comparator：外部实现，定义"自定义排序"，更灵活
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // 创建商品列表
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 1900.00));
        products.add(new Product("Banana", 2200.00));
        products.add(new Product("Orange", 1300.00));
        products.add(new Product("Water", 4010.00));
        
        // 打印排序前的列表
        System.out.println("===排序前===");
        for (Product p : products) {
            System.out.println(p);
        }
        
        // 使用 Collections.sort() 排序
        // 传入 Comparator 匿名内部类定义排序规则
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                // 按价格升序排列
                // 返回负数：o1 排在 o2 前面
                // 返回正数：o1 排在 o2 后面
                // 返回 0：两者相等
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        
        // 打印排序后的列表
        System.out.println("===排序后===");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
