/**
 * StringTest - String 类常用方法演示
 * 
 * 本程序演示 String 类的常用 API：
 * 1. length() - 获取字符串长度
 * 2. charAt() - 获取指定位置的字符
 * 3. indexOf() - 查找子串位置
 * 4. substring() - 截取子串
 * 5. equals() - 比较内容（区分大小写）
 * 6. equalsIgnoreCase() - 比较内容（忽略大小写）
 * 
 * 注意：String 是不可变对象，所有方法都返回新字符串，不会修改原字符串
 */
public class StringTest {
    public static void main(String[] args) {
        // 1. length() — 获取字符串长度
        System.out.println("hello".length());                           // 输出: 5

        // 2. charAt() — 获取指定索引位置的字符
        // 索引从 0 开始，charAt(1) 获取第 2 个字符
        System.out.println("hello".charAt(1));                          // 输出: e

        // 3. indexOf() — 查找子串第一次出现的位置
        // 返回子串起始索引，找不到返回 -1
        System.out.println("hello world".indexOf("rld"));             // 输出: 6

        // 4. substring() — 截取子串
        // substring(int beginIndex)：从指定索引截取到末尾
        System.out.println("hello".substring(2));                       // 输出: llo
        // substring(int beginIndex, int endIndex)：截取 [begin, end) 范围
        System.out.println("hello".substring(0, 2));                    // 输出: he

        // 5. equals() — 区分大小写比较内容
        // String 重写了 equals 方法，比较的是字符串内容而非引用
        System.out.println("Java".equals("java"));                      // 输出: false

        // 6. equalsIgnoreCase() — 忽略大小写比较内容
        System.out.println("Java".equalsIgnoreCase("java"));            // 输出: true
    }
}
