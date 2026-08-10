public class Goods {
    String name;
    double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "商品名称：" + name + "，价格：" + price + "元";
    }
}