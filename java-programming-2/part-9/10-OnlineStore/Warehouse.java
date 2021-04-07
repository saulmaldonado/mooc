
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> inventory;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.inventory = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        inventory.put(product, stock);
    }
    
    public int price(String product) {
        if(prices.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if(inventory.containsKey(product)) {
            return inventory.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if(stock(product) > 0) {
            inventory.put(product, inventory.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        return inventory.keySet();
    }
}

