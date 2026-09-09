public class Product {
    private String name;
    private double price;

    public Product() {
        this.name = "默认商品";
        this.price = 0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printlnf() {
        System.out.printf("商品名称：%s，价格：%.2f%n", name, price);
    }

    // getter / setter（可选，反射调用时不一定需要）
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}