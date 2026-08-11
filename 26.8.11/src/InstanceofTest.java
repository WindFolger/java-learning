public class InstanceofTest {
    public static void main(String[] args) {
        AnimalV2 a = new Dog("小黄",5);
        AnimalV2 b = new Cat("小咪",4);
        Dog d=(Dog)a;
        d.WatchDoor();
        Cat c=(Cat)b;
        c.eat();
    }
}
