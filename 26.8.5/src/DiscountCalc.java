import java.util.Scanner;

public class DiscountCalc {
    public static void main(String[] args) {
        double price;double price1;double price2;int FullReduction=0;
        Scanner input = new Scanner(System.in);
        price = input.nextDouble();
        price1 = price*0.8;
        if (price1>=100){
            FullReduction = (int)(price1/100);
        }
        price2=price1-20*FullReduction;
        System.out.printf("原价为"+price+"折后为"+price1+"满减后为"+price2);

    }
}
