public class SynchronizeTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        new Thread(myRunnable,"一").start();
        new Thread(myRunnable,"二").start();
        new Thread(myRunnable,"三").start();

    }
}
class MyRunnable implements Runnable{
    private int tickets=100;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(tickets<=0){
                    break;
                }

            try{Thread.sleep(10);}catch(InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName()+"卖出第"+tickets--);
        }
    }
}}