import java.io.*;


public class BufferedCopy {
    public static void main(String[] args) {
        // 源文件和目标文件路径
        String sourcePath = "source.bin";
        String destPath1 = "copy_unbuffered.bin";
        String destPath2 = "copy_buffered.bin";

        // 创建一个较大的测试文件（约 10MB），方便看出速度差异
        createLargeFile(sourcePath, 10);

        System.out.println("=== 普通字节流复制 ===");
        long start1 = System.currentTimeMillis();  // 记录开始时间（毫秒）
        try {
            copyWithPlainStream(sourcePath, destPath1);
        } catch (IOException e) {
            System.err.println("普通流复制失败: " + e.getMessage());
        }
        long end1 = System.currentTimeMillis();      // 记录结束时间
        System.out.println("耗时: " + (end1 - start1) + " ms");

        System.out.println("\n=== 缓冲流复制 ===");
        long start2 = System.currentTimeMillis();
        try {
            copyWithBufferedStream(sourcePath, destPath2);
        } catch (IOException e) {
            System.err.println("缓冲流复制失败: " + e.getMessage());
        }
        long end2 = System.currentTimeMillis();
        System.out.println("耗时: " + (end2 - start2) + " ms");
    }

    public static void copyWithPlainStream(String sourcePath, String destPath) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            int b;
            // 逐字节读写，每次循环都进行一次系统 IO 调用
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
    }


    public static void copyWithBufferedStream(String sourcePath, String destPath) throws IOException {
        // 构造：BufferedInputStream 作为 FileInputStream 的装饰器
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {

            int b;
            // 表面上也是逐字节读，但实际是从内存缓冲区取，极少访问磁盘
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            // 关闭外层流（bis/bos）时，会自动关闭内层流（fis/fos）
        }
    }


    public static void createLargeFile(String path, int sizeMB) {
        byte[] data = new byte[1024 * 1024];  // 1MB 的缓冲区
        try (FileOutputStream fos = new FileOutputStream(path)) {
            for (int i = 0; i < sizeMB; i++) {
                fos.write(data);  // 写入 sizeMB 次，总共 sizeMB MB
            }
            System.out.println("测试文件已创建: " + path + " (" + sizeMB + " MB)");
        } catch (IOException e) {
            System.err.println("创建测试文件失败: " + e.getMessage());
        }
    }
}