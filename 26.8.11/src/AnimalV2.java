public class AnimalV2 {
    private String name;
    private int age;
    public AnimalV2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public AnimalV2() {

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void eat() {
        System.out.println(getName() + " is eating");
    }
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

}
