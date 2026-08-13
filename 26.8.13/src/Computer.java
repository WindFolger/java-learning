public class Computer {
    // USB 插槽数组（假设电脑有 4 个 USB 口）
    private UsbTest[] usbDevices = new UsbTest[4];
    private int deviceCount = 0;  // 记录当前插了几个设备

    // 插入 USB 设备
    public void plugIn(UsbTest device) {
        if (deviceCount < usbDevices.length) {
            usbDevices[deviceCount] = device;
            deviceCount++;
            System.out.println("设备插入成功");
        } else {
            System.out.println("USB 插槽已满！");
        }
    }

    // 统一启动所有设备
    public void powerOn() {
        System.out.println("=== 电脑开机，启动所有 USB 设备 ===");
        for (int i = 0; i < deviceCount; i++) {
            usbDevices[i].start();
        }
    }

    // 统一关闭所有设备
    public void powerOff() {
        System.out.println("=== 电脑关机，停止所有 USB 设备 ===");
        for (int i = 0; i < deviceCount; i++) {
            usbDevices[i].stop();
        }
    }
}