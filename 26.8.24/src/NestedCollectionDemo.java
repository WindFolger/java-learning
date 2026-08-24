import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NestedCollectionDemo - 嵌套集合演示
 * 
 * 本程序演示复杂的数据结构：
 * Map<String, List<Product>>：按产地分类存储商品
 * 
 * 数据结构：
 * {
 *   "广东": [华为, OPPO手机],
 *   "北京": [小米手机, 联想电脑],
 *   "上海": [上海手表]
 * }
 * 
 * 核心操作：
 * 1. addProduct：添加商品到对应产地的列表
 * 2. 遍历：按产地分类输出
 * 3. 查询：获取指定产地的所有商品
 * 4. average：计算指定产地的平均价格
 * 5. MostValue：查找所有商品中最贵的
 */
public class NestedCollectionDemo {
    public static void main(String[] args) {
        // 创建嵌套集合：产地 → 商品列表
        Map<String, List<Product>> originmap = new HashMap<>();
        
        // 添加商品数据
        addProduct(originmap, "广东", new Product("华为", 4999));
        addProduct(originmap, "广东", new Product("OPPO手机", 2999.0));
        addProduct(originmap, "北京", new Product("小米手机", 1999.0));
        addProduct(originmap, "北京", new Product("联想电脑", 5499.0));
        addProduct(originmap, "上海", new Product("上海手表", 1299.0));
        
        // 打印所有商品（按产地分类）
        System.out.println("所有商品");
        for (Map.Entry<String, List<Product>> entry : originmap.entrySet()) {
            String origin = entry.getKey();         // 产地
            List<Product> products = entry.getValue(); // 该产地的商品列表
            System.out.println(origin);
            for (Product p : products) {
                System.out.println(p);
            }
        }
        
        // 查询指定产地的商品
        System.out.println("广东");
        List<Product> GD = originmap.get("广东");
        if (GD != null) {
            for (Product p : GD) {
                System.out.println(p);
            }
        }
        
        // 计算平均价格
        System.out.println("平均价格");
        double avg = average(originmap, "广东");
        System.out.println(avg);
        
        // 查找最贵的商品
        System.out.println("最贵的");
        Product most = MostValue(originmap);
        System.out.println(most);
    }
    
    /**
     * 添加商品到指定产地的列表
     * 如果该产地还没有列表，先创建列表
     * 
     * @param map 产地 → 商品列表的映射
     * @param origin 产地
     * @param product 要添加的商品
     */
    private static void addProduct(Map<String, List<Product>> map, String origin, Product product) {
        // 获取该产地的商品列表
        List<Product> list = map.get(origin);
        
        // 如果该产地还没有列表，创建新列表并放入 map
        if (list == null) {
            list = new ArrayList<>();
            map.put(origin, list);
        }
        
        // 添加商品到列表
        list.add(product);
    }
    
    /**
     * 计算指定产地的平均价格
     * 
     * @param map 产地 → 商品列表的映射
     * @param origin 要计算的产地
     * @return 平均价格，若该产地无商品返回 0
     */
    private static double average(Map<String, List<Product>> map, String origin) {
        List<Product> list = map.get(origin);
        // 判空：列表为空或不存在时返回 0
        if (list == null || list.isEmpty()) {
            return 0;
        }
        
        // 计算总和
        double sum = 0;
        for (Product p : list) {
            sum += p.getPrice();
        }
        
        // 返回平均值
        return sum / list.size();
    }
    
    /**
     * 查找所有商品中价格最高的
     * 
     * @param map 产地 → 商品列表的映射
     * @return 价格最高的商品，若无商品返回 null
     */
    private static Product MostValue(Map<String, List<Product>> map) {
        Product max = null;
        
        // 遍历所有产地的商品列表
        for (List<Product> list : map.values()) {
            for (Product p : list) {
                // 如果当前商品比 max 贵，更新 max
                if (max == null || p.getPrice() > max.getPrice()) {
                    max = p;
                }
            }
        }
        
        return max;
    }
}
