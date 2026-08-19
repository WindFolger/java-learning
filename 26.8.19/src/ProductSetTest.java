import java.util.HashSet;
import java.util.Set;

public class ProductSetTest {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        Product p1=new Product(1,"IP",566);
        Product p2=new Product(1,"IP",566);
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());
        System.out.println(set);
    }
}
