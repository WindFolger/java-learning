/**
 * Keyboard - 键盘类（实现 USB 接口）
 * 
 * 本类演示：
 * 1. 实现 UsbTest 接口
 * 2. 使用 @Override 注解标记接口方法的实现
 */
public class Keyboard implements UsbTest {
    
    /**
     * 实现 start 方法：键盘启动
     */
    @Override
    public void start() {
        System.out.println("Keyboard start");
    }
    
    /**
     * 实现 stop 方法：键盘停止
     */
    @Override
    public void stop() {
        System.out.println("Keyboard stop");
    }
}
