import java.util.Scanner;

/**
 * MenuSwitch - 菜单选择系统（switch 分支演示）
 * 
 * 本程序演示：
 * 1. switch 多分支语句：根据变量值选择执行不同的代码块
 * 2. case 标签：定义每个分支的匹配值
 * 3. break 语句：跳出 switch，防止"穿透"到下一个 case
 * 4. default 分支：处理所有未匹配的情况
 * 
 * switch 适用场景：当需要对同一个变量的多个离散值进行判断时
 */
public class MenuSwitch {
    public static void main(String[] args) {
        // 打印菜单信息
        System.out.println("=====农产品查询系统=====");
        System.out.println("1.查看所有农产品");
        System.out.println("2.按价格排序显示");
        System.out.println("3.按产地筛选显示");
        System.out.println("4.退出系统");
        System.out.println("请输入选项（1-4）");
        
        // 创建 Scanner 读取用户选择
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        // switch 语句：根据 choice 的值执行不同分支
        switch (choice) {
            case 1:
                // 当 choice 等于 1 时执行
                System.out.println("正在加载所有农产品信息...\n" +
                        "- 东北大米 | 5.8元/斤 | 黑龙江\n" +
                        "- 红富士苹果 | 4.5元/斤 | 山东\n" +
                        "- 巨峰葡萄 | 6.2元/斤 | 河北");
                break;  // break 很重要！没有 break 会"穿透"到下一个 case
                
            case 2:
                // 当 choice 等于 2 时执行
                System.out.println("正在按价格从低到高排序...\n" +
                        "- 红富士苹果 | 4.5元/斤\n" +
                        "- 东北大米 | 5.8元/斤\n" +
                        "- 巨峰葡萄 | 6.2元/斤"
                );
                break;
                
            case 3:
                // 当 choice 等于 3 时执行
                System.out.println("请输入产地：山东\n" +
                        "正在筛选山东产地的农产品...\n" +
                        "- 红富士苹果 | 4.5元/斤 | 山东"
                );
                break;
                
            case 4:
                // 当 choice 等于 4 时执行：退出系统
                System.out.println("感谢使用");
                break;
                
            default:
                // 当没有任何 case 匹配时执行
                System.out.println("无效选择，请重新输入！");
                break;
        }
    }
}
