public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }
    public void watchdoor(){
        System.out.println(getName()+"看门");
    }

}
