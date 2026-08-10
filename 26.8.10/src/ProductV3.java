public class ProductV3 extends Goods {
    String origin;
    int stock;

    public ProductV3(String name, double price, String origin, int stock) {
        super(name, price);
        this.origin = origin;
        this.stock = stock;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，产地：" + origin + "，库存：" + stock + "件";
    }
}