import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        System.out.println("=====农产品查询系统=====");
        System.out.println("1.查看所有农产品");
        System.out.println("2.按价格排序显示");
        System.out.println("3.按产地筛选显示");
        System.out.println("4.退出系统");
        System.out.println("请输入选项（1-4）");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:System.out.println("正在加载所有农产品信息...\n" +
                    "- 东北大米 | 5.8元/斤 | 黑龙江\n" +
                    "- 红富士苹果 | 4.5元/斤 | 山东\n" +
                    "- 巨峰葡萄 | 6.2元/斤 | 河北");
            break;
            case 2:System.out.println("正在按价格从低到高排序...\n" +
                    "- 红富士苹果 | 4.5元/斤\n" +
                    "- 东北大米 | 5.8元/斤\n" +
                    "- 巨峰葡萄 | 6.2元/斤"
            );
            break;
            case 3:System.out.println("请输入产地：山东\n" +
                    "正在筛选山东产地的农产品...\n" +
                    "- 红富士苹果 | 4.5元/斤 | 山东"

            );
            break;
            case 4:System.out.println("感谢使用");
            break;
            default:System.out.println("无效选择，请重新输入！");
            break;
        }
    }
}
