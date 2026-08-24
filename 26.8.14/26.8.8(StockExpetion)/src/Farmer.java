import java.util.Scanner;

/**
 * Farmer - 农民类（带自定义异常版本）
 * 
 * 本类演示：
 * 1. 抛出自定义异常：使用 throw 关键字
 * 2. 声明异常：使用 throws 关键字
 * 
 * throws vs throw：
 * - throws：声明方法可能抛出的异常类型，放在方法签名后面
 * - throw：实际抛出异常对象，放在方法体内部
 */
public class Farmer {
    /** 农民姓名 */
    String name;
    
    /** 农民电话 */
    String phone;
    
    /**
     * sellProduct 方法：销售商品
     * 
     * @param p 要销售的商品
     * @param quantity 销售数量
     * @throws StockException 当库存不足时抛出此异常
     * 
     * throws 声明：告知调用方此方法可能抛出 StockException
     */
    public void sellProduct(Product p, int quantity) throws StockException {
        if (quantity > p.stock) {
            // 库存不足，抛出自定义异常
            // throw 后面跟异常对象，会中断当前方法的执行
            throw new StockException(p.stock, quantity);
        }
        // 库存充足，扣减库存
        p.stock -= quantity;
        System.out.println("出售成功 ");
    }
}
