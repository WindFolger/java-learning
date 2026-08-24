/**
 * ExceptionDemo - 异常处理演示
 * 
 * 本程序演示 Java 异常处理机制：
 * 1. try-catch：捕获并处理异常
 * 2. 多种常见异常类型：
 *    - ArithmeticException：算术异常（如除以零）
 *    - ArrayIndexOutOfBoundsException：数组索引越界
 *    - NullPointerException：空指针异常
 * 
 * 异常处理的好处：
 * - 防止程序因异常而崩溃
 * - 提供友好的错误提示
 * - 可以进行异常恢复或记录日志
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        
        // ========== 1. 算术异常（除以零）==========
        try {
            int a = 10;
            int b = 0;
            // 整数除以零会抛出 ArithmeticException
            int c = a / b;
            System.out.println(c);
        } catch (RuntimeException e) {
            // 捕获异常并输出错误信息
            // RuntimeException 是所有运行时异常的父类
            System.out.println(e.getMessage());
        }
        
        // ========== 2. 数组越界异常 ==========
        try {
            int[] arr = new int[3];  // 创建长度为 3 的数组
            // 访问索引 5，但数组只有索引 0、1、2
            int value = arr[5];  // 访问不存在的索引
            System.out.println("数组值: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 捕获数组越界异常
            System.out.println("捕获到数组越界: " + e.getMessage());
        }

        // ========== 3. 空指针异常 ==========
        try {
            String str = null;  // str 不指向任何对象
            // 对 null 调用方法会抛出 NullPointerException
            int length = str.length();
            System.out.println("字符串长度: " + length);
        } catch (NullPointerException e) {
            // 捕获空指针异常
            System.out.println("捕获到空指针异常: " + e.getMessage());
        }
    }
}
