/**
 * FinallyTest - finally 块演示
 * 
 * 本程序演示：
 * 1. finally 块：无论是否发生异常，都会执行
 * 2. 即使 catch 中有 return，finally 仍然执行
 * 
 * finally 的典型用途：
 * - 关闭资源（文件、数据库连接、网络连接等）
 * - 释放锁
 * - 清理工作
 * 
 * 执行顺序：
 * try → 发生异常 → catch 处理 → finally → 方法返回（如果有 return）
 */
public class FinallyTest {
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = 0;
            // 除以零会抛出 ArithmeticException
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            // 捕获算术异常
            System.out.println(e.getMessage());
            // 即使有 return，finally 仍然会执行
            return;
        } finally {
            // finally 块中的代码一定会执行
            // 常用于资源清理，如关闭文件流
            System.out.println("finally");
        }
    }
}
