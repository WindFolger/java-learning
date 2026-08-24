import java.util.HashSet;
import java.util.Set;

/**
 * HashSetDemo - HashSet 集合演示
 * 
 * 本程序演示 HashSet 的核心特性：
 * 
 * 1. 无序：元素没有固定的顺序（基于哈希值存储）
 * 2. 不重复：不会存储重复元素
 * 3. 允许 null：可以存储一个 null 元素
 * 
 * 去重原理：
 * - HashSet 内部使用 HashMap 实现
 * - 添加元素时先计算 hashCode，再比较 equals
 * - 只有 hashCode 和 equals 都相同才视为重复
 * 
 * 使用场景：
 * - 需要去重的集合
 * - 判断元素是否存在的快速查询（O(1)）
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // 创建 HashSet，使用泛型指定存储 String 类型
        Set<String> set = new HashSet<>();
        
        // 添加元素
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");  // 重复元素，不会被添加
        
        // 输出集合大小：应为 4（重复元素只算一个）
        System.out.println(set.size());
        
        // 输出集合内容（无序排列）
        System.out.println(set);
        
        // 遍历集合（增强 for 循环）
        for (String s : set) {
            System.out.println(s);
        }
    }
}
