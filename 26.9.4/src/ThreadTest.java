public class ThreadTest  {
    public static void main(String[] args) {
        new SellTicket("一").start();
        new SellTicket("二").start();
        new SellTicket("三").start();

    }
    static class SellTicket extends Thread{
        int ticket=100;
        public SellTicket(String name) {
            super(name);
        }
        @Override
        public void run() {
            while (ticket>0){
                try{Thread.sleep(10);
                }catch (InterruptedException e) {
                    e.printStackTrace();

                }
                System.out.println(getName()+"卖出"+ticket--);
            }

        }
    }


}
