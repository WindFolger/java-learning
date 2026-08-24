/**
 * Mouse - 鼠标类（实现 USB 接口）
 * 
 * 本类演示：
 * 1. 实现 UsbTest 接口
 * 2. 不同设备对接口方法的不同实现
 */
public class Mouse implements UsbTest {
    
    /**
     * 实现 start 方法：鼠标启动
     */
    public void start() {
        System.out.println("Starting");
    }
    
    /**
     * 实现 stop 方法：鼠标停止
     */
    public void stop() {
        System.out.println("Stopping");
    }
}
