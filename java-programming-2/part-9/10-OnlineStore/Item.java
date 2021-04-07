public class Item {
    
    private String product;
    private int qyt;
    private int unitPrice;

    public Item(String product, int qyt, int unitPrice) {
        this.product = product;
        this.qyt = qyt;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * qyt;
    }
    
    public void increaseQuantity() {
        qyt++;
    }
    
    @Override
    public String toString() {
        return product + ": " + qyt;
    }
    
}

