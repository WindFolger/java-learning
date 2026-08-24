import java.util.Scanner;

/**
 * DiscountCalc - 折扣计算器
 * 
 * 本程序演示：
 * 1. 从控制台读取用户输入（Scanner 类的使用）
 * 2. 基本的数据类型（double, int）
 * 3. 算术运算和类型转换
 * 4. 条件判断（if 语句）
 * 
 * 业务逻辑：输入商品价格，先打 8 折，然后每满 100 减 20
 */
public class DiscountCalc {
    public static void main(String[] args) {
        // 声明变量：price 存储原价，price1 存储折扣价，price2 存储满减后价格
        double price;
        double price1;
        double price2;
        
        // FullReduction 记录满减次数（每满100减20）
        // 使用驼峰命名法应为 fullReduction，这里保留原始风格
        int FullReduction = 0;
        
        // Scanner 是 Java 用于读取输入的工具类
        // System.in 代表标准输入（键盘）
        Scanner input = new Scanner(System.in);
        
        // nextDouble() 读取用户输入的一个双精度浮点数
        price = input.nextDouble();
        
        // 计算折扣价：原价打 8 折
        price1 = price * 0.8;
        
        // 判断是否满足满减条件：折扣后价格 >= 100
        if (price1 >= 100) {
            // 计算满减次数：折扣价除以 100 取整
            // (int) 是强制类型转换，将 double 转为 int（截断小数部分）
            FullReduction = (int)(price1 / 100);
        }
        
        // 计算最终价格：折扣价减去满减金额（每满100减20）
        price2 = price1 - 20 * FullReduction;
        
        // 输出结果，展示原价、折扣价和最终价格
        System.out.printf("原价为" + price + "折后为" + price1 + "满减后为" + price2);
    }
}
