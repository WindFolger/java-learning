import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class ProductFixed {
    private int id;
    private String name;
    private double price;
    public ProductFixed(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductFixed that = (ProductFixed) o;
        return id == that.id&&Double.compare(that.price,price) == 0&&name.equals(that.name);
    }
    public int hashCode() {
        return Objects.hash(id, name, price);
    }


    public String toString() {
        return "id: " + id + ", name: " + name + ", price: " + price;
    };
    public static void main(String[] args) {
        Set<ProductFixed> set = new HashSet<>();
        ProductFixed p1 = new ProductFixed(1, "IP", 50);
        ProductFixed p2 = new ProductFixed(1, "IP", 50);
        ProductFixed p3 = new ProductFixed(2, "MB", 50);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set.size());
        for (ProductFixed p : set) {
            System.out.println(p);
        }
    }
}
