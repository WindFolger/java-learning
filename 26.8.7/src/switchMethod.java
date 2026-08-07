import java.util.Scanner;

public class switchMethod {
    public void showAll(){
        System.out.println("showAll");
    }
    public void sortbyprice(){
        System.out.println("sortbyprice");
    }
    public static void main(String[] args){
        switchMethod sm = new switchMethod();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:sm.sortbyprice();
            break;
            case 2:sm.showAll();
            break;
        }
    }
}
