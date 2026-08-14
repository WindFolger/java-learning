import java.util.Scanner;

public class Farmer {
    String name;
    String phone;
    public void sellProduct(Product p,int quantity){
        if(quantity<p.stock){
            p.stock=p.stock-quantity;
            System.out.println("出售成功");
        }else if(quantity>p.stock){
            System.out.println("库存不足");
        }

    }
}
