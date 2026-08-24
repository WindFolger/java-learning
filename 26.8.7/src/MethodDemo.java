/**
 * MethodDemo - 方法重载演示
 * 
 * 本程序演示：
 * 1. 方法重载（Overloading）：同一类中方法名相同但参数不同
 * 2. 参数类型不同的重载：add(int, int) 和 add(double, double)
 * 3. 对象创建与方法调用
 * 
 * 方法重载规则：
 * - 方法名必须相同
 * - 参数列表必须不同（类型、个数或顺序）
 * - 返回类型可以不同，但仅凭返回类型不同不构成重载
 */
public class MethodDemo {
    
    /**
     * 整数加法：计算两个 int 类型数的和
     * 
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 两数之和
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 浮点数加法：计算两个 double 类型数的和
     * 这是方法重载的典型示例，与上面的 add 方法名相同但参数类型不同
     * 
     * @param a 第一个浮点数
     * @param b 第二个浮点数
     * @return 两数之和
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * 打印信息方法
     * 
     * @param name 名称
     * @param productName 产品名称
     */
    public void printTnfo(String name, String productName) {
        System.out.println(name + " " + productName);
    }

    /**
     * 程序入口
     */
    public static void main(String[] args) {
        // 创建 MethodDemo 对象
        MethodDemo md = new MethodDemo();
        
        // 调用整数版本的 add 方法
        // Java 编译器根据传入的参数类型自动匹配对应的方法
        int sum1 = md.add(1, 2);
        System.out.println(sum1);
        
        // 调用浮点数版本的 add 方法
        double sum2 = md.add(1.2, 22.1);
        System.out.println(sum2);
        
        // 调用打印方法
        md.printTnfo("zhansan", "shouji");
    }
}
