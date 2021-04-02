
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final int capacity;
    private final ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(item.getWeight() + getWeight() <= capacity) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    public int getWeight() {
        int sum = 0;
        for(Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }
}

