import java.util.Scanner;
public class Farmer {
    String name;
    String phone;
    public void sellProduct(Product p,int quantity)throws StockException{
        if(quantity>p.stock){
            throw new StockException(p.stock,quantity);
        }
        p.stock -= quantity;
        System.out.println("出售成功 ");

    }
}
