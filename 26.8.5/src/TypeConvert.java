/**
 * TypeConvert - 类型转换演示
 * 
 * 本程序演示：
 * 1. 变量声明与初始化
 * 2. 基本数据类型的隐式转换（自动类型提升）
 * 3. int 与 double 之间的运算规则
 * 
 * 关键知识点：
 * - 当 int 和 double 混合运算时，int 会自动提升为 double
 * - 赋值时如果目标类型范围更大，可以自动转换（隐式转换）
 */
public class TypeConvert {
    public static void main(String[] args) {
        // 声明并初始化一个 int 类型变量
        // int 是整数类型，占 4 个字节，范围约 -21亿 到 21亿
        int chuanchu = 500;
        
        // 声明一个 double 类型变量
        // double 是双精度浮点数，占 8 个字节，精度更高
        double meimu;
        
        // 赋值运算：int 类型的 chuanchu 先除以 10（int 运算），结果仍是 int（50）
        // 然后将 int 结果自动转换为 double 赋给 meimu（50.0）
        // 注意：如果希望保留小数，应该写成 chuanchu / 10.0
        meimu = chuanchu / 10;
        
        // 输出结果到控制台
        System.out.println(meimu);
    }
}
