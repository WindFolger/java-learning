import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("C:\\D\\JV\\java-learning\\26.8.25");
        if(!dir.exists()){
            boolean created = dir.mkdirs();
            System.out.println((created?"yes":"no")+dir.getAbsolutePath());

        }else {
            System.out.println("文件在"+dir.getAbsolutePath());
        }
        File file =new File(dir,"file.txt");
        try{
            if(file.exists()){
                boolean created = file.createNewFile();
                System.out.println(created?"yes":"no"+file.getAbsolutePath());
            }else {
                System.out.println("已存在"+file.getAbsolutePath());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("=====判断存在=====");
        System.out.println("dir.exists()? " + dir.exists());
        System.out.println("dir.isDirectory()? " + dir.isDirectory());
        System.out.println("file.exists()? " + file.exists());
        System.out.println("file.isFile()? " + file.isFile());
        listFilesRecursive(new File("."), 0);
    }
    public static void listFilesRecursive(File dir, int level) {
        if (!dir.exists() || !dir.isDirectory()) return;
        File[] files = dir.listFiles();
        if (files == null) return;

        String indent = "  ".repeat(level);
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(indent + "[DIR]  " + f.getName());
                listFilesRecursive(f, level + 1);
            } else {
                System.out.println(indent + "[FILE] " + f.getName() + " (" + f.length() + " bytes)");
            }
        }
    }
}
