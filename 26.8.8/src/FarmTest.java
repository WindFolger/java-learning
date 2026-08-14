public class FarmTest {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        farmer.name="王";
        farmer.phone="13364554545";
        Product rice = new Product();
        rice.name = "东北大米";
        rice.price = 59.9;
        rice.origin = "黑龙江";
        rice.stock = 100;



        farmer.sellProduct(rice, 200);

    }
}
