public class USTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        UsbTest mouse=new Mouse();
        UsbTest keyboard=new Keyboard();
        computer.plugIn(mouse);
        computer.plugIn(keyboard);
        computer.powerOn();
        computer.powerOff();
    }
}
