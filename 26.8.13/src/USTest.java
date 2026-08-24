/**
 * USTest - 匿名内部类演示
 * 
 * 本程序演示：
 * 1. 匿名内部类（Anonymous Inner Class）：直接 new 接口并在大括号中实现方法
 * 2. 接口回调：将接口实现作为参数传递
 * 
 * 匿名内部类的好处：
 * - 不需要单独创建一个类文件
 * - 适合只使用一次的场景
 * - 代码更紧凑
 * 
 * 使用场景：
 * 当只需要临时实现一个接口，且这个实现不会被其他地方复用时，
 * 使用匿名内部类比创建新类更简洁。
 */
public class USTest {
    public static void main(String[] args) {
        // 创建 Computer 对象
        Computer computer = new Computer();
        
        // 使用匿名内部类创建鼠标设备
        // new UsbTest() { ... } 创建了一个没有名字但实现了 UsbTest 接口的类
        UsbTest mouse = new UsbTest() {
            @Override
            public void start() {
                System.out.println("鼠标启动");
            }

            @Override
            public void stop() {
                System.out.println("鼠标停止");
            }
        };
        
        // 使用匿名内部类创建键盘设备
        UsbTest keyboard = new UsbTest() {
            @Override
            public void start() {
                System.out.println("键盘启动");
            }
            @Override
            public void stop() {
                System.out.println("键盘停止");
            }
        };

        // 将设备插入电脑
        computer.plugIn(mouse);
        computer.plugIn(keyboard);
        
        // 开机和关机
        computer.powerOn();
        computer.powerOff();
    }
}
