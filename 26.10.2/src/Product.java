public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String origin;
    private Integer stock;
    public Product() {
    }
    public Product(Integer id, String name, Double price, String origin, Integer stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.stock = stock;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                ", stock=" + stock +
                '}';
    }
}
