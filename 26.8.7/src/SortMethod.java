import java.util.Scanner;

/**
 * SortMethod - 冒泡排序方法封装
 * 
 * 本程序演示：
 * 1. 将排序逻辑封装为独立方法
 * 2. 方法参数传递（数组作为参数）
 * 3. 方法调用与返回值（void 表示无返回值）
 * 
 * 方法的好处：
 * - 代码复用：排序逻辑可以多次使用
 * - 职责分离：main 方法负责流程控制，bubbleSort 负责排序逻辑
 * - 便于维护：修改排序算法只需改一处
 */
public class SortMethod {
    
    /**
     * bubbleSort 方法：对传入的数组进行冒泡排序（升序）
     * 
     * @param arr 待排序的 double 数组
     *            数组是引用类型，方法内修改会影响原数组
     */
    public void bubbleSort(double[] arr) {
        // 外层循环：控制排序轮数，n 个元素需要 n-1 轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环：每轮比较相邻元素
            // arr.length - 1 - i：减去已排好的元素数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前一个元素大于后一个，交换位置（升序）
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * 程序入口
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        
        System.out.println("Enter the elements in the array");
        
        // 创建数组存储输入的元素
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        
        // 创建 SortMethod 对象并调用排序方法
        SortMethod sm = new SortMethod();
        sm.bubbleSort(arr);
        
        // 输出排序后的结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
