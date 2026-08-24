/**
 * BoxingDemo - 自动装箱与拆箱演示
 * 
 * 本程序演示 Java 包装类的核心概念：
 * 
 * 1. 手动装箱（Boxing）：基本类型 → 包装类
 *    Integer b = Integer.valueOf(a);
 * 
 * 2. 手动拆箱（Unboxing）：包装类 → 基本类型
 *    int c = b.intValue();
 * 
 * 3. 自动装箱（Auto-boxing）：编译器自动转换
 *    Integer d = c;  // 编译器自动转换为 Integer.valueOf(c)
 * 
 * 4. 自动拆箱（Auto-unboxing）：编译器自动转换
 *    int e = d;  // 编译器自动转换为 d.intValue()
 * 
 * 包装类的作用：
 * - 集合框架只能存储对象，不能存储基本类型
 * - 提供了丰富的方法和常量（如 Integer.MAX_VALUE）
 * - 可以实现 null 值表示"无数据"
 */
public class BoxingDemo {
    public static void main(String[] args) {
        // 基本类型 int
        int a = 10;
        
        // 手动装箱：使用 Integer.valueOf() 将 int 转为 Integer
        Integer b = Integer.valueOf(a);
        
        // 手动拆箱：使用 intValue() 将 Integer 转为 int
        int c = b.intValue();

        // 自动装箱：编译器自动插入 Integer.valueOf()
        Integer d = c;
        
        // 自动拆箱：编译器自动插入 intValue()
        int e = d;
    }
}
