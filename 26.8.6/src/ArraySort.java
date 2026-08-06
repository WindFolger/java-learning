import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("请输入农产品个数");
        n=sc.nextInt();
        System.out.println("请输入农产品价格");
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int j = 0; j < arr.length-1; j++) {
            for(int g=0;g<arr.length-j-1;g++){
                if(arr[g]>arr[g+1]){
                    double temp=arr[g];
                    arr[g]=arr[g+1];
                    arr[g+1]=temp;
                }
            }
        }
        for (int o = 0; o < arr.length; o++) {
            System.out.print(arr[o]+" ");
        }
    }
}