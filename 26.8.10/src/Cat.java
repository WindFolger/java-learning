public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println(name+"在吃鱼");
    }
    public void catchMouse(){
        System.out.println(name+"捉老鼠");
    }
}
