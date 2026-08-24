import java.util.Scanner;

/**
 * LoopPractice - 循环结构练习
 * 
 * 本程序演示：
 * 1. for 循环：用于已知次数的循环（九九乘法表）
 * 2. while 循环：用于条件控制的循环（累加求和）
 * 3. do-while 循环：先执行后判断（输入价格求平均）
 * 4. 嵌套循环：循环内部包含另一个循环
 */
public class LoopPractice {
    public static void main(String[] args) {
        // ========== 第一部分：for 循环打印九九乘法表 ==========
        // 外层循环控制行数（被乘数），从 1 到 9
        for (int i = 1; i < 10; i++) {
            // 内层循环控制列数（乘数），每行从 1 到当前行数 i
            // 这是典型的嵌套循环应用
            for (int j = 1; j <= i; j++) {
                // 打印乘法公式，使用 \t 或空格分隔
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            // 每行结束后换行
            System.out.println();
        }
        
        // ========== 第二部分：while 循环求 1 到 99 的和 ==========
        // while 循环：先判断条件，条件为真才执行循环体
        int j = 1;      // 循环变量初始化
        int sum = 0;    // 累加器，用于存储求和结果
        while (j < 100) {
            sum += j;   // 等价于 sum = sum + j，将当前数加入总和
            j++;        // 循环变量自增，避免死循环
        }
        System.out.println(sum);  // 输出 1+2+3+...+99 的结果
        
        // ========== 第三部分：do-while 循环求平均价格 ==========
        // do-while 循环：先执行一次循环体，再判断条件
        // 适合至少需要执行一次的场景
        Scanner input = new Scanner(System.in);
        double price1 = 0;   // 存储每次输入的价格
        double sum1 = 0;     // 价格总和
        int count = 0;       // 记录输入的价格个数
        
        do {
            System.out.println("请输入价格，输入-1结束");
            price1 = input.nextDouble();
            // 判断是否结束标记
            if (price1 != -1) {
                sum1 += price1;   // 累加有效价格
                count++;          // 计数器加 1
            }
        } while (price1 != -1);  // 当输入 -1 时结束循环
        
        // 计算并输出平均价格
        if (count > 0) {
            double avg = sum1 / count;  // 平均值 = 总和 / 个数
            System.out.println("共输入" + count + "个价格，平均价格为" + avg);
        } else {
            System.out.println("无价格");
        }
    }
}
