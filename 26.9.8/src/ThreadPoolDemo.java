import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i <=10; i++) {
            final int index = i;
            pool.execute(()->{
                try{
                    Thread.sleep(500);
                    System.out.println("线程"+Thread.currentThread().getName()+"正在执行任务"+index);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
    }
}
