import java.util.Scanner;

/**
 * ArraySort - 数组排序（冒泡排序）
 * 
 * 本程序演示：
 * 1. 数组的声明与动态初始化
 * 2. 使用 Scanner 读取用户输入填充数组
 * 3. 冒泡排序算法的实现
 * 4. 嵌套 for 循环的应用
 * 
 * 冒泡排序原理：
 * - 重复走访数组，每次比较相邻两个元素
 * - 如果顺序错误就交换它们
 * - 每轮结束后，最大的元素会"冒泡"到数组末尾
 * - 时间复杂度：O(n²)
 */
public class ArraySort {
    public static void main(String[] args) {
        // 创建 Scanner 对象用于读取输入
        Scanner sc = new Scanner(System.in);
        
        // n 用于存储农产品个数
        int n = 0;
        
        // 提示用户输入
        System.out.print("请输入农产品个数");
        n = sc.nextInt();
        
        System.out.println("请输入农产品价格");
        
        // 声明并创建数组：长度为 n，存储 double 类型的价格
        // 数组是相同类型数据的集合，通过索引访问（从 0 开始）
        double[] arr = new double[n];
        
        // 循环读取 n 个价格，存入数组
        // arr.length 获取数组的长度
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        
        // 冒泡排序：外层循环控制排序轮数
        // 每轮确定一个最大元素的位置，所以只需 n-1 轮
        for (int j = 0; j < arr.length - 1; j++) {
            // 内层循环进行相邻元素比较和交换
            // arr.length - j - 1：每轮结束后，最后 j 个元素已排好序，无需再比较
            for (int g = 0; g < arr.length - j - 1; g++) {
                // 如果前一个元素大于后一个元素，交换它们（升序排列）
                if (arr[g] > arr[g + 1]) {
                    // 使用临时变量 temp 进行交换
                    double temp = arr[g];
                    arr[g] = arr[g + 1];
                    arr[g + 1] = temp;
                }
            }
        }
        
        // 输出排序后的数组
        for (int o = 0; o < arr.length; o++) {
            System.out.print(arr[o] + " ");
        }
    }
}
