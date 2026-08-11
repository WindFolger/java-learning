public class Cat extends AnimalV2 {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish");

    }
    public void catchMouse() {
        System.out.println(getName() + " is catching mouse");
    }

}
