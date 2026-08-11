public class AnimalTestV2 {
    public static void main(String[] args) {
        AnimalV2 a=new Dog("大黄",13);
        a.eat();
        a.sleep();
        AnimalV2 b=new Cat("咪咪",5);
        b.eat();
        b.sleep();
        AnimalFarm.feed(a);
        AnimalFarm.feed(b);
    }
}
