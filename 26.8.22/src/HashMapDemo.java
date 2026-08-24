import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // 创建 HashMap，存储农产品 → 价格
        HashMap<String, Double> products = new HashMap<>();

        // 1. put：添加数据
        products.put("苹果", 5.5);
        products.put("香蕉", 3.2);
        products.put("橙子", 4.8);
        products.put("葡萄", 12.0);
        System.out.println("初始数据: " + products);

        // 2. get：获取价格
        double price = products.get("苹果");
        System.out.println("苹果的价格: " + price);

        // 3. containsKey：判断是否包含某个农产品
        if (products.containsKey("香蕉")) {
            System.out.println("包含香蕉");
        }

        // 4. remove：删除
        products.remove("橙子");
        System.out.println("删除橙子后: " + products);

        // 5. keySet 遍历
        System.out.println("\n--- keySet 遍历 ---");
        Set<String> keys = products.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + products.get(key));
        }

        // 6. entrySet 遍历（推荐，效率更高）
        System.out.println("\n--- entrySet 遍历 ---");
        Set<Map.Entry<String, Double>> entries = products.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}