/**
 * ProductInfo - 商品信息展示
 * 
 * 本程序演示：
 * 1. 多种基本数据类型的声明与使用
 *    - String：字符串类型，用于文本
 *    - double：双精度浮点数，用于价格
 *    - int：整数类型，用于库存数量
 *    - boolean：布尔类型，用于真假判断
 *    - char：字符类型，用于单个字符
 * 2. 字符串拼接（使用 + 号连接）
 */
public class ProductInfo {
    public static void main(String[] args) {
        // String 是引用数据类型，用于存储文本字符串
        // 使用双引号 " " 包裹字符串内容
        String productname = "大米";
        
        // double 用于存储带小数的价格
        double price = 5.8;
        
        // int 用于存储整数库存量
        int stock = 1000;
        
        // boolean 只有两种值：true（真）或 false（假）
        boolean isOrganic = true;
        
        // char 用于存储单个字符，使用单引号 ' ' 包裹
        char grade = 'A';
        
        // 使用 + 号进行字符串拼接，将变量嵌入到输出文本中
        // Java 会自动将其他类型转为字符串进行拼接
        System.out.print("商品：" + productname + ",价格：" + price + "库存：" + stock + "斤,有机：" + isOrganic + "等级：" + grade);
    }
}
