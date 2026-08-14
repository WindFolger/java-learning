public class ExceptionDemo {
   public  static  void main(String []args){
       try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());

       }
       try {
           int[] arr = new int[3];
           int value = arr[5];  // 访问不存在的索引
           System.out.println("数组值: " + value);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("捕获到数组越界: " + e.getMessage());
       }

       // 3. 空指针 (NullPointerException)
       try {
           String str = null;
           int length = str.length();  // 对 null 调用方法
           System.out.println("字符串长度: " + length);
       } catch (NullPointerException e) {
           System.out.println("捕获到空指针异常: " + e.getMessage());
       }

   }
}
