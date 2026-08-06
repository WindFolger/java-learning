import java.util.Scanner;

public class GradeJudge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入含水量: % ");
        double water = input.nextDouble();
        System.out.println("请输入蛋白质含量： %");
        double danbai= input.nextDouble();
        if(water<=13.0&&danbai>=25.0){
            System.out.println("优质");
        }else if(water<=14.0&&danbai>=20.0){
            System.out.println("合格");
        }else if(water>14.0||danbai<20.0){
            System.out.println("不合格");

        }
    }
}
