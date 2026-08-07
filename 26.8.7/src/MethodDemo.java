public class MethodDemo {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void printTnfo(String name, String productName) {
        System.out.println(name + " " + productName);
    }

    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        int sum1 = md.add(1, 2);
        System.out.println(sum1);
        double sum2 = md.add(1.2, 22.1);
        System.out.println(sum2);
        md.printTnfo("zhansan", "shouji");
    }
}