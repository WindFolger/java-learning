import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+i * j + " ");
            }
            System.out.println();
        }
        int j=1;
        int sum=0;
        while(j<100){
            sum +=j;
            j++;
        }System.out.println(sum);
        Scanner input = new Scanner(System.in);
        double price1=0;
        double sum1=0;
        int count=0;
        do{
            System.out.println("请输入价格，输入-1结束");
            price1 = input.nextDouble();
            if(price1!=-1){
                sum1+=price1;
                count++;
            }

        }while (price1!=-1);
        if(count>0){
            double avg=sum1/count;
            System.out.println("共输入"+count+"个价格，平均价格为"+avg);
        }else System.out.println("无价格");
    }
}
