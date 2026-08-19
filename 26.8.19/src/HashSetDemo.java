import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");
        System.out.println(set.size());
        System.out.println(set);
        for(String s: set){
            System.out.println(s);
        }
    }
}
