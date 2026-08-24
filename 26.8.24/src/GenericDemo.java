/**
 * GenericDemo - 泛型类使用演示
 * 
 * 本程序演示：
 * 1. 泛型类的实例化：Box<String>、Box<Integer>、Box<Product>
 * 2. 类型安全：编译器确保只能存入指定类型的数据
 * 3. 自动拆箱：Integer → int
 */
public class GenericDemo {
    public static void main(String[] args) {
        // ========== Box<String>：存储字符串 ==========
        Box<String> strBox = new Box<>();
        strBox.setData("hello");
        String s = strBox.getData();  // 无需强制类型转换
        System.out.println(s);

        // ========== Box<Integer>：存储整数 ==========
        Box<Integer> intBox = new Box<>();
        intBox.setData(100);
        Integer num = intBox.getData();
        System.out.println(num);

        // ========== Box<Product>：存储自定义对象 ==========
        Box<Product> productBox = new Box<>();
        productBox.setData(new Product("Phone", 8999));
        Product p = productBox.getData();
        System.out.println(p);
    }
}
