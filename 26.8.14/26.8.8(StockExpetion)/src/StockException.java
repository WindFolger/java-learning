public class StockException extends Exception {

    public StockException(String message) {
        super(message);
    }
    public StockException(int currentStock, int required) {
        super(currentStock + " is out of stock, required " + required);
    }
}
