import java.util.Scanner;

/**
 * GradeJudge - 等级判定系统
 * 
 * 本程序演示：
 * 1. 多条件 if-else if-else 分支结构
 * 2. 逻辑运算符 &&（与）和 ||（或）
 * 3. 复合条件的判断逻辑
 * 
 * 判定规则：
 * - 优质：含水量 <= 13% 且 蛋白质 >= 25%
 * - 合格：含水量 <= 14% 且 蛋白质 >= 20%
 * - 不合格：含水量 > 14% 或 蛋白质 < 20%
 */
public class GradeJudge {
    public static void main(String[] args) {
        // 创建 Scanner 读取用户输入
        Scanner input = new Scanner(System.in);
        
        // 提示并读取含水量
        System.out.println("请输入含水量: % ");
        double water = input.nextDouble();
        
        // 提示并读取蛋白质含量
        System.out.println("请输入蛋白质含量： %");
        double danbai = input.nextDouble();
        
        // 多分支判断：从上到下依次判断条件
        // && 是逻辑与运算符：两边都为 true 时结果才为 true
        if (water <= 13.0 && danbai >= 25.0) {
            System.out.println("优质");
        } 
        // else if：当上面的条件不满足时，继续判断此条件
        else if (water <= 14.0 && danbai >= 20.0) {
            System.out.println("合格");
        } 
        // || 是逻辑或运算符：只要有一边为 true，结果就为 true
        else if (water > 14.0 || danbai < 20.0) {
            System.out.println("不合格");
        }
    }
}
