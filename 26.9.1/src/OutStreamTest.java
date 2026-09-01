import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 class ObjectOutStream {
    public static void main(String[] args)throws IOException {
        String filePath="C:\\D\\JV\\java-learning\\26.9.1\\data.dat";
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeDouble(123.45);
        oos.writeUTF("hello");
        oos.writeObject(new Dog("旺财",9));
        oos.close();
        System.out.println("成功");

    }

}
class Dog implements Serializable {
    private String name;
    private int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString() {
        return ("Dog's name is "+name+" and age is "+age);
    }
}
