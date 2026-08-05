import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%400==0||year%4==0){
            System.out.println(year+"是闰年");
        }else System.out.println(year+"不是闰年");
    }
}
