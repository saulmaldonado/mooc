public class Container {
    private final int maxAmount = 100;
    
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return amount;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            this.amount += amount;
            if(this.amount > maxAmount) {
                this.amount = maxAmount;
            }
        }
    }
    
    public void remove(int amount) {
        if(this.amount < amount) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }
    
    @Override
    public String toString() {
        return amount + "/" + maxAmount;
    }
}

