public class Dog extends AnimalV2{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating bone");

    }
    public void WatchDoor() {
        System.out.println(getName() + " is watching door");
    }
}
