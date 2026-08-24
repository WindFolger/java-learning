/**
 * StringBuilderTest - StringBuilder 性能对比
 * 
 * 本程序演示 String 与 StringBuilder 在频繁拼接时的性能差异：
 * 
 * String 的不可变性：
 * - String 是不可变对象，每次拼接都会创建新对象
 * - b = b + a 实际上创建了新的 String 对象
 * - 频繁拼接时产生大量临时对象，效率低下
 * 
 * StringBuilder 的可变性：
 * - StringBuilder 内部使用可扩展的字符数组
 * - append 方法直接修改内部数组，不创建新对象
 * - 适合频繁修改字符串的场景
 * 
 * 结论：
 * - 少量字符串操作：用 String
 * - 频繁字符串拼接：用 StringBuilder（单线程）或 StringBuffer（多线程）
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String a = "a";      // 要拼接的字符串
        int count = 10000;   // 拼接次数
        
        // ========== String 拼接（慢）==========
        String b = "b";      // 初始字符串
        long start1 = System.currentTimeMillis();  // 记录开始时间
        for (int i = 0; i < count; i++) {
            // 每次循环都创建新的 String 对象
            b = b + a;
        }
        long end1 = System.currentTimeMillis();    // 记录结束时间
        System.out.println(end1 - start1);         // 输出耗时（毫秒）

        // ========== StringBuilder 拼接（快）==========
        long start2 = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();     // 创建 StringBuilder
        for (int i = 0; i < count; i++) {
            // 直接修改内部字符数组，不创建新对象
            s.append(a);
        }
        String result = s.toString();              // 转为 String
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);         // 输出耗时（毫秒）
    }
}
