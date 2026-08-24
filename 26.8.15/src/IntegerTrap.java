/**
 * IntegerTrap - Integer 缓存陷阱
 * 
 * 本程序演示 Java Integer 包装类的一个重要特性：
 * 
 * Integer 缓存机制：
 * - Java 对 -128 到 127 之间的 Integer 对象进行了缓存
 * - 使用自动装箱或 Integer.valueOf() 时，这个范围内的值会复用缓存对象
 * - 超出此范围则创建新的对象
 * 
 * 陷阱：
 * - 对于缓存范围内的值，== 比较结果为 true（同一对象）
 * - 对于超出范围的值，== 比较结果为 false（不同对象）
 * - 所以包装类比较应该始终使用 equals() 方法
 * 
 * 正确做法：
 * Integer c = 128; Integer d = 128;
 * c.equals(d)  // 始终返回 true
 */
public class IntegerTrap {
    public static void main(String[] args) {
        // 127 在缓存范围内（-128 ~ 127），复用同一对象
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);  // 输出: true（同一对象）
        
        // 128 超出缓存范围，创建不同对象
        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);  // 输出: false（不同对象）
    }
}
