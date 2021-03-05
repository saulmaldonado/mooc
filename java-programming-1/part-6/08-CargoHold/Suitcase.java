
import java.util.ArrayList;

public class Suitcase {
    private final int maxWeight;
    private int weight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if((item.getWeight() + this.weight) <= maxWeight) {
            items.add(item);
            this.weight += item.getWeight();
        }
    }
    
    @Override
    public String toString() {
        String message = "";
        
        if(items.isEmpty()) {
            message = "no items";
        } else if(items.size() == 1) {
            message = "1 item";
        } else {
            message = items.size() + " items";
        }
        return message + " (" + weight + " kg)";
    }
    
    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for(Item item : items) {
            total += item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for(int i = 1; i < items.size(); i++) {
            Item current = items.get(i);
            if(current.getWeight() > heaviest.getWeight()) {
                heaviest = current;
            }
        }
        return heaviest;
    }
}

