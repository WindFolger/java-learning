/**
 * FarmTest - 自定义异常测试
 * 
 * 本程序演示：
 * 1. try-catch 捕获自定义异常
 * 2. 获取自定义异常的信息
 * 
 * 异常处理流程：
 * 1. 调用 sellProduct(200)，库存只有 100
 * 2. Farmer.sellProduct 中 throw new StockException(100, 200)
 * 3. 异常被抛回给调用方
 * 4. FarmTest 的 catch 块捕获异常
 * 5. 输出异常信息："100 is out of stock, required 200"
 */
public class FarmTest {
    public static void main(String[] args) {
        // 创建农民对象
        Farmer farmer = new Farmer();
        farmer.name = "王";
        farmer.phone = "13364554545";
        
        // 创建商品对象
        Product rice = new Product();
        rice.name = "东北大米";
        rice.price = 59.9;
        rice.origin = "黑龙江";
        rice.stock = 100;  // 库存 100

        try {
            // 尝试卖出 200，会抛出 StockException
            farmer.sellProduct(rice, 200);
        } catch (StockException e) {
            // 捕获自定义异常，输出异常信息
            System.out.println(e.getMessage());
        }
    }
}
