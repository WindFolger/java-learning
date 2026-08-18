public class Product {
    private String name;
    private double price;
    int id;
    public Product(int id,String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
      return "Product{" + "name=" + name + ", price=" + price + ", id=" + id + '}';
    };
}
