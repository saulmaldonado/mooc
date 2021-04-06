
import java.util.ArrayList;

public class Box implements Packable {
    private final double maxWeight;
    private final ArrayList<Packable> items;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(weight() + item.weight() <= maxWeight) {
            items.add(item);
        }
    }
    
     public double weight() {
        double total = 0.0;
        for(Packable item : items) {
            total += item.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}

