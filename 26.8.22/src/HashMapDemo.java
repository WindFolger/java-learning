import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMapDemo - HashMap 常用操作演示
 * 
 * 本程序演示 HashMap 的核心 API：
 * 
 * 1. put(K, V)：添加键值对
 * 2. get(K)：根据键获取值
 * 3. containsKey(K)：判断是否包含指定键
 * 4. remove(K)：删除指定键的映射
 * 5. keySet()：获取所有键的集合
 * 6. entrySet()：获取所有键值对的集合（推荐遍历方式）
 * 
 * HashMap 特点：
 * - 基于哈希表实现，查询/插入/删除平均 O(1)
 * - 键不允许重复（重复 put 会覆盖旧值）
 * - 值可以重复
 * - 键和值都可以为 null（但键只能有一个 null）
 * - 无序
 * - 线程不安全
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 创建 HashMap，键为 String（农产品名称），值为 Double（价格）
        HashMap<String, Double> products = new HashMap<>();

        // 1. put：添加数据（键 → 值）
        products.put("苹果", 5.5);
        products.put("香蕉", 3.2);
        products.put("橙子", 4.8);
        products.put("葡萄", 12.0);
        System.out.println("初始数据: " + products);

        // 2. get：根据键获取值
        double price = products.get("苹果");
        System.out.println("苹果的价格: " + price);

        // 3. containsKey：判断是否包含某个键
        if (products.containsKey("香蕉")) {
            System.out.println("包含香蕉");
        }

        // 4. remove：删除指定键的映射
        products.remove("橙子");
        System.out.println("删除橙子后: " + products);

        // 5. keySet 遍历：遍历所有键，再通过键获取值
        System.out.println("\n--- keySet 遍历 ---");
        Set<String> keys = products.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + products.get(key));
        }

        // 6. entrySet 遍历（推荐，效率更高）：
        // 直接遍历键值对，不需要通过键二次查找值
        System.out.println("\n--- entrySet 遍历 ---");
        Set<Map.Entry<String, Double>> entries = products.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
