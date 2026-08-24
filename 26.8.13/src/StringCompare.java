/**
 * StringCompare - 字符串比较详解
 * 
 * 本程序演示字符串比较的核心区别：
 * 
 * 1. == 运算符：比较引用（内存地址）
 *    - 对于字符串字面量，Java 会放入字符串常量池，相同内容的字面量共享同一对象
 *    - 使用 new 创建的字符串，会在堆内存中创建新对象
 * 
 * 2. equals() 方法：比较内容
 *    - String 类重写了 equals 方法，比较字符序列是否相同
 *    - 只要内容相同，equals 就返回 true
 * 
 * 内存分析：
 * - a = "abc"     → 指向常量池中的 "abc" 对象
 * - b = "abc"     → 也指向常量池中的同一个 "abc" 对象（a == b 为 true）
 * - c = new String("abc") → 在堆中创建新对象（a == c 为 false）
 * - 但 a.equals(c) 为 true，因为内容相同
 */
public class StringCompare {
    public static void main(String[] args) {
        // 字符串字面量，存储在常量池中
        String a = "abc";
        String b = "abc";
        
        // 使用 new 创建字符串，在堆内存中创建新对象
        String c = new String("abc");
        
        // == 比较引用地址
        if (a == b) {
            // a 和 b 都指向常量池中的同一个对象，所以为 true
            System.out.println("a==b");
        }
        
        if (a == c) {
            // a 指向常量池，c 指向堆内存的新对象，所以为 false
            System.out.println("a==c");
        } else {
            System.out.println("a!=c");
        }
        
        // equals 比较内容
        if (a.equals(b)) {
            // 内容相同，为 true
            System.out.println("a==b");
        } else {
            System.out.println("a!=b");
        }
        
        if (a.equals(c)) {
            // 内容相同，为 true（String 重写了 equals 方法）
            System.out.println("a==c");
        } else {
            System.out.println("a!=c");
        }
    }
}
