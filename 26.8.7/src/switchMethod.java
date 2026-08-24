import java.util.Scanner;

/**
 * switchMethod - 方法封装与 switch 结合
 * 
 * 本程序演示：
 * 1. 自定义方法的定义与调用
 * 2. 创建对象来调用非静态方法
 * 3. switch 语句配合方法调用实现菜单功能
 * 
 * 方法（Method）是封装了特定功能的代码块，
 * 可以被重复调用，提高代码复用性。
 */
public class switchMethod {
    
    /**
     * showAll 方法：显示所有信息
     * 非静态方法，需要通过对象来调用
     */
    public void showAll() {
        System.out.println("showAll");
    }
    
    /**
     * sortbyprice 方法：按价格排序
     * 当前只是占位输出，实际应用中会实现排序逻辑
     */
    public void sortbyprice() {
        System.out.println("sortbyprice");
    }
    
    /**
     * 程序入口
     */
    public static void main(String[] args) {
        // 创建 switchMethod 类的对象
        // new 关键字用于创建对象实例
        switchMethod sm = new switchMethod();
        
        // 创建 Scanner 读取用户输入
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        // 根据用户输入调用不同的方法
        switch (a) {
            case 1:
                // 调用对象的 sortbyprice 方法
                sm.sortbyprice();
                break;
            case 2:
                // 调用对象的 showAll 方法
                sm.showAll();
                break;
        }
    }
}
