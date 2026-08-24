import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 * ListCompare - ArrayList vs LinkedList 性能对比
 * 
 * 本程序演示两种 List 实现在中间插入场景的性能差异：
 * 
 * ArrayList：
 * - 基于动态数组实现
 * - 中间插入需要移动后续所有元素，时间复杂度 O(n)
 * - 频繁中间插入时性能较差
 * 
 * LinkedList：
 * - 基于双向链表实现
 * - 中间插入只需修改前后节点的引用，时间复杂度 O(1)（查找位置仍是 O(n)）
 * - 频繁中间插入时性能更好
 * 
 * 使用建议：
 * - 查询多、增删少：用 ArrayList
 * - 增删多、查询少：用 LinkedList
 */
public class ListCompare {
    public static void main(String[] args) {
        // 创建 ArrayList 和 LinkedList
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        
        // 初始化数据
        for (int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i);
        }
        
        // ========== ArrayList 中间插入测试 ==========
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int middle = list1.size() / 2;  // 找到中间位置
            list1.add(middle, -1);           // 在中间插入
        }
        long end1 = System.currentTimeMillis();
        System.out.println("ArrayList 耗时: " + (end1 - start1) + " ms");
        
        // ========== LinkedList 中间插入测试 ==========
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int middle = list2.size() / 2;  // 找到中间位置
            list2.add(middle, -1);           // 在中间插入
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList 耗时: " + (end2 - start2) + " ms");
    }
}
