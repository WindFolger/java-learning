/**
 * Computer - 电脑类（USB 设备管理）
 * 
 * 本类演示：
 * 1. 面向接口编程：使用 UsbTest 接口类型管理设备
 * 2. 数组的使用：管理多个 USB 设备
 * 3. 统一调用接口方法，实现多态效果
 * 
 * 核心思想：
 * Computer 类只关心设备是否实现了 UsbTest 接口，
 * 不关心具体是键盘、鼠标还是其他设备。
 * 新增设备类型不需要修改 Computer 类。
 */
public class Computer {
    
    /** USB 插槽数组（假设电脑有 4 个 USB 口） */
    private UsbTest[] usbDevices = new UsbTest[4];
    
    /** 记录当前插了几个设备 */
    private int deviceCount = 0;

    /**
     * 插入 USB 设备
     * 
     * @param device 实现了 UsbTest 接口的设备对象
     */
    public void plugIn(UsbTest device) {
        if (deviceCount < usbDevices.length) {
            usbDevices[deviceCount] = device;
            deviceCount++;
            System.out.println("设备插入成功");
        } else {
            System.out.println("USB 插槽已满！");
        }
    }

    /**
     * 统一启动所有设备
     * 多态的体现：调用不同设备的 start 方法
     */
    public void powerOn() {
        System.out.println("=== 电脑开机，启动所有 USB 设备 ===");
        for (int i = 0; i < deviceCount; i++) {
            usbDevices[i].start();
        }
    }

    /**
     * 统一关闭所有设备
     */
    public void powerOff() {
        System.out.println("=== 电脑关机，停止所有 USB 设备 ===");
        for (int i = 0; i < deviceCount; i++) {
            usbDevices[i].stop();
        }
    }
}
