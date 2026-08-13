public class StringTest {
    public static void main(String[] args) {
        // 1. length() — 获取字符串长度
        System.out.println("hello".length());                           // 输出: 5

// 2. charAt() — 获取指定索引位置的字符
        System.out.println("hello".charAt(1));                          // 输出: e

// 3. indexOf() — 查找子串第一次出现的位置
        System.out.println("hello world".indexOf("rld"));             // 输出: 6

// 4. substring() — 截取子串（从索引2到末尾 / 从索引0到5，不含5）
        System.out.println("hello".substring(2));                       // 输出: llo
        System.out.println("hello".substring(0, 2));                    // 输出: he

// 5. equals() — 区分大小写比较内容
        System.out.println("Java".equals("java"));                      // 输出: false

// 6. equalsIgnoreCase() — 忽略大小写比较内容
        System.out.println("Java".equalsIgnoreCase("java"));            // 输出: true
    }


}
