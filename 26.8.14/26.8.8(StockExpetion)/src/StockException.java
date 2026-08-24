/**
 * StockException - 自定义异常类
 * 
 * 本类演示：
 * 1. 自定义异常：继承 Exception 类
 * 2. 构造器重载：提供不同的异常信息构造方式
 * 
 * 自定义异常的好处：
 * - 语义更清晰：StockException 明确表示库存异常
 * - 可以携带更多上下文信息（如当前库存、需求量）
 * - 便于调用方针对性处理
 * 
 * 注意：继承 Exception 的异常是"受检异常"（Checked Exception），
 * 方法必须声明 throws 或在 try-catch 中处理。
 */
public class StockException extends Exception {

    /**
     * 构造器：传入异常消息
     * @param message 异常描述信息
     */
    public StockException(String message) {
        super(message);
    }
    
    /**
     * 构造器：传入库存信息自动生成消息
     * 
     * @param currentStock 当前库存量
     * @param required 需求量
     */
    public StockException(int currentStock, int required) {
        super(currentStock + " is out of stock, required " + required);
    }
}
