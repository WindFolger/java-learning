import java.util.Scanner;

/**
 * LeapYear - 闰年判断器
 * 
 * 本程序演示：
 * 1. 从控制台读取整数输入
 * 2. 逻辑运算符的使用（|| 或运算）
 * 3. 取模运算符 %（求余数）
 * 4. 条件分支（if-else）
 * 
 * 闰年规则：
 * - 能被 400 整除的是闰年
 * - 或者能被 4 整除但不能被 100 整除的是闰年
 * 本程序简化判断：能被 400 整除 或 能被 4 整除（实际逻辑有简化）
 */
public class LeapYear {
    public static void main(String[] args) {
        // 声明变量 year 用于存储输入的年份
        int year;
        
        // 创建 Scanner 对象读取键盘输入
        Scanner sc = new Scanner(System.in);
        
        // nextInt() 读取用户输入的整数
        year = sc.nextInt();
        
        // 判断是否为闰年
        // % 是取模运算符，计算除法的余数
        // || 是逻辑或运算符，只要其中一个条件为 true，整个表达式就为 true
        // 注意：此判断逻辑有简化，完整闰年规则还需排除能被100整除但不能被400整除的年份
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
