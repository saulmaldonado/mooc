
import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases;
    private int weight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.weight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }
}

