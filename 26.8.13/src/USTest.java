public class USTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        UsbTest mouse =new UsbTest() {
            @Override
            public void start() {
                System.out.println("鼠标启动");
            }

            @Override
            public void stop() {
                System.out.println("鼠标停止");
            }
        };
        UsbTest keyboard =new UsbTest() {
            @Override
            public void start() {
                System.out.println("键盘启动");
            }
            @Override
            public void stop() {
                System.out.println("键盘停止");
            }
        };

        computer.plugIn(mouse);
        computer.plugIn(keyboard);
        computer.powerOn();
        computer.powerOff();
    }
}
