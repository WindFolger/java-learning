import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayListDemo - ArrayList 集合演示
 * 
 * 本程序演示 ArrayList 的常用操作：
 * 1. 创建集合：ArrayList<Product> list = new ArrayList<>()
 * 2. 添加元素：add()
 * 3. 获取元素：get(index)
 * 4. 删除元素：remove(index)
 * 5. 获取大小：size()
 * 6. 三种遍历方式：
 *    - 普通 for 循环
 *    - Iterator 迭代器
 *    - 增强 for 循环（foreach）
 * 
 * ArrayList 特点：
 * - 基于数组实现，查询快（O(1)），增删慢（O(n)）
 * - 有序（按插入顺序排列）
 * - 可重复
 * - 线程不安全
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建 ArrayList，使用泛型指定存储类型为 Product
        ArrayList<Product> list = new ArrayList<>();
        
        System.out.println("元素");
        
        // 添加元素到列表
        list.add(new Product(1, "手机", 10000.0));
        list.add(new Product(2, "电脑", 4000.0));
        list.add(new Product(3, "鼠标", 10.0));
        list.add(new Product(4, "平板", 3999.0));
        list.add(new Product(5, "手表", 1299.0));
        
        // 获取列表大小
        System.out.println(list.size());
        
        // get(index)：根据索引获取元素（索引从 0 开始）
        Product p = list.get(2);  // 获取第 3 个元素
        System.out.println(p);
        
        // remove(index)：删除指定索引的元素，返回被删除的元素
        Product remove = list.remove(4);  // 删除第 5 个元素
        System.out.println(remove);
        
        // 删除后大小变为 4
        System.out.println(list.size());
        
        // ========== 遍历方式 1：普通 for 循环 ==========
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("=============");
        
        // ========== 遍历方式 2：Iterator 迭代器 ==========
        // Iterator 是集合框架提供的统一遍历接口
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {      // hasNext() 判断是否还有下一个元素
            System.out.println(iterator.next());  // next() 获取下一个元素
        }
        
        System.out.println("=============");
        
        // ========== 遍历方式 3：增强 for 循环（foreach）==========
        // 最简洁的遍历方式，底层使用 Iterator
        for (Product p1 : list) {
            System.out.println(p1);
        }
    }
}
