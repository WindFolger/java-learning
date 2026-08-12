public class Keyboard implements UsbTest {
    @Override
    public void start() {
        System.out.println("Keyboard start");
    }
    @Override
    public void stop() {
        System.out.println("Keyboard stop");
    }
}
