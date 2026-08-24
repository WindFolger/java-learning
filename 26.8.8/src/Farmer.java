import java.util.Scanner;

/**
 * Farmer - 农民类
 * 
 * 本类演示：
 * 1. 类的属性定义
 * 2. 方法参数的使用：对象可以作为参数传递
 * 3. 条件判断控制业务流程
 * 
 * 类与类的协作：
 * Farmer 类依赖于 Product 类，通过 sellProduct 方法实现销售功能
 */
public class Farmer {
    /** 农民姓名 */
    String name;
    
    /** 农民电话 */
    String phone;
    
    /**
     * sellProduct 方法：销售商品
     * 
     * @param p 要销售的商品对象（引用传递）
     * @param quantity 销售数量
     * 
     * 注意：Product 是引用类型，方法内修改 p.stock 会影响原对象
     */
    public void sellProduct(Product p, int quantity) {
        // 判断库存是否充足
        if (quantity < p.stock) {
            // 库存充足：扣减库存
            p.stock = p.stock - quantity;
            System.out.println("出售成功");
        } else if (quantity > p.stock) {
            // 库存不足
            System.out.println("库存不足");
        }
    }
}
