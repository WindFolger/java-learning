import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class ListCompare {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        for(int i=0;i<10;i++){
            list1.add(i);
            list2.add(i);
        }long start1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int middle = list1.size() / 2;  // 找到中间位置
            list1.add(middle, -1);           // 在中间插入
        }

        long end1 = System.currentTimeMillis();
        System.out.println("ArrayList 耗时: " + (end1 - start1) + " ms");
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            int middle = list2.size() / 2;  // 找到中间位置
            list2.add(middle, -1);           // 在中间插入
        }

        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList 耗时: " + (end2 - start2) + " ms");
    }

}
