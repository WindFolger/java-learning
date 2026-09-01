import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStreamTest {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        String filePath="C:\\D\\JV\\java-learning\\26.9.1\\data.dat";
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog =ois.readObject();
        System.out.println(dog);
        System.out.println(dog.getClass());
        ois.close();

    }
}
