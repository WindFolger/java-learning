import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        System.out.println("元素");
        list.add(new Product(1,"手机",10000.0));
        list.add(new Product(2,"电脑",4000.0));
        list.add(new Product(3,"鼠标",10.0));
        list.add(new Product(4, "平板", 3999.0));
        list.add(new Product(5, "手表", 1299.0));
        System.out.println(list.size());
        Product p = list.get(2);
        System.out.println(p);
        Product remove = list.remove(4);
        System.out.println(remove);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("=============");
        Iterator<Product> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============");
        for(Product p1:list){
            System.out.println(p1);
        }

    }
}
