import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destPath = "copy_of_source.txt";
        createSampleFile(sourcePath);
        try {
            copyFile(sourcePath, destPath);
            System.out.println("复制成功！");
            System.out.println("源: " + new File(sourcePath).getAbsolutePath());
            System.out.println("目标: " + new File(destPath).getAbsolutePath());
        } catch (IOException e) {
            System.err.println("复制失败: " + e.getMessage());
        }
    }

    public static void copyFile(String sourcePath, String destPath) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.flush();
        }
    }

    public static void createSampleFile(String path) {
        String content = "Hello, World!\n这是一行中文测试。\nFileCopy 字节流复制测试。\n";
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(content.getBytes());
            System.out.println("示例源文件已创建");
        } catch (IOException e) {
            System.err.println("创建示例文件失败: " + e.getMessage());
        }
    }
}