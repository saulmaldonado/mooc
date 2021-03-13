public class Container {
    private final int maxAmount = 100;
    
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public void add(int amount) {
        this.amount += amount;
        if(this.amount > maxAmount) {
            this.amount = maxAmount;
        }
    }
    
    public int remove(int amount) {
        if(this.amount < amount) {
            int waterToRemove = this.amount;
            this.amount = 0;
            return waterToRemove;
        }
        this.amount -= amount;
        return amount;
    }
    
    @Override
    public String toString() {
        return amount + "/" + maxAmount;
    }
}

