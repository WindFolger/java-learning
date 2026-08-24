/**
 * UsbTest - USB 接口
 * 
 * 本接口演示：
 * 1. 接口的实际应用场景：USB 设备规范
 * 2. 定义统一的 start 和 stop 方法，所有 USB 设备都必须实现
 * 
 * 接口的设计思想：
 * - 定义规范（契约）：所有实现类必须遵守
 * - 实现解耦：Computer 类只需要知道 UsbTest 接口，不需要知道具体是什么设备
 */
public interface UsbTest {
    
    /**
     * 启动设备
     */
    void start();
    
    /**
     * 停止设备
     */
    void stop();
}
