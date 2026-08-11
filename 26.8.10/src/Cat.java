public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println(getName()+"在吃鱼");
    }
    public void catchMouse(){
        System.out.println(getName()+"捉老鼠");
    }
}
