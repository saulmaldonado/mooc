public class Container {
    private int amount;
    private final int limit = 100;

    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        
        if(this.limit - this.amount >= amount) {
            this.amount += amount;
        } else {
            this.amount = 100;
        }
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            return;
        }
        
        if(this.amount >= amount) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
}

