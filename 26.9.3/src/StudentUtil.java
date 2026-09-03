import java.io.*;
import java.util.ArrayList;

public class StudentUtil{
    private static final String FilePath="C:\\D\\JV\\java-learning\\26.9.3\\data.dat";
    public static ArrayList<Student> loadFile(){
        File file=new File(FilePath);
        if(!file.exists()){
            System.out.println("文件不存在");
            return new ArrayList<>();
        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file))){
            ArrayList<Student> list=(ArrayList<Student>)ois.readObject();
            return list;
        }catch (Exception e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }
    public static void saveFile(ArrayList<Student> list){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FilePath))){
            oos.writeObject(list);
            System.out.println("保存成功"+list.size());
        }catch (Exception e){
            System.err.println("保存失败"+e.getMessage());
        }
    }
}
