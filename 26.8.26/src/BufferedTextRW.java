import java.io.*;

/**
 * BufferedTextRW.java
 * 使用 BufferedReader 按行读取 + BufferedWriter 按行写出文本文件
 *
 * 字符缓冲流特点：
 * - BufferedReader: 支持 readLine() 方法，一次读取一整行，自动去掉行尾换行符
 * - BufferedWriter: 支持 newLine() 方法，自动写入系统相关的换行符（\n 或 \r\n）
 * - 适合处理文本文件，代码更简洁，无需手动处理字节和编码
 */
public class BufferedTextRW {
    public static void main(String[] args) {
        String sourcePath = "input.txt";
        String destPath = "output.txt";

        // 先创建示例输入文件
        createSampleInput(sourcePath);

        // 执行按行读写
        try {
            copyTextByLine(sourcePath, destPath);
            System.out.println("文本文件按行读写完成！");
            System.out.println("输出文件: " + new File(destPath).getAbsolutePath());
        } catch (IOException e) {
            System.err.println("读写失败: " + e.getMessage());
        }
    }

    /**
     * 按行读取源文件，处理后再按行写入目标文件
     *
     * @param sourcePath 源文本文件路径
     * @param destPath   目标文本文件路径
     * @throws IOException 文件不存在、无权限、编码错误等
     */
    public static void copyTextByLine(String sourcePath, String destPath) throws IOException {
        // BufferedReader 构造时需要 Reader，FileReader 是字符流，默认使用系统编码
        // 如需指定编码，可用：new InputStreamReader(new FileInputStream(path), "UTF-8")
        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))) {

            String line;
            // readLine() 读取一行内容，返回字符串（不含行尾换行符）
            // 读到文件末尾时返回 null
            while ((line = br.readLine()) != null) {
                // 对每行内容做简单处理：转为大写（仅为演示）
                String processed = line.toUpperCase();

                // write() 写入字符串内容（不会自动换行）
                bw.write(processed);

                // newLine() 写入系统默认的换行符
                // Windows: \r\n   Linux/Mac: \n
                // 比手动写 "\n" 更好的跨平台写法
                bw.newLine();
            }

            // 刷新缓冲区，确保所有数据写入磁盘
            bw.flush();
        }
        // try-with-resources 自动关闭 br 和 bw
    }

    /**
     * 创建示例输入文件，包含多行文本
     */
    public static void createSampleInput(String path) {
        String[] lines = {
                "Hello, World!",
                "这是一行中文内容。",
                "Java IO 流操作练习。",
                "BufferedReader 按行读取很方便。",
                "BufferedWriter newLine() 自动换行。"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();  // 每行结束后写入换行符
            }
            System.out.println("示例输入文件已创建: " + new File(path).getAbsolutePath());
        } catch (IOException e) {
            System.err.println("创建示例文件失败: " + e.getMessage());
        }
    }
}