public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println(name+"吃骨头");
    }
    public void watchdoor(){
        System.out.println(name+"看门");
    }

}
