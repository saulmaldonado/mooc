
import java.util.ArrayList;

public class ChangeHistory {
    private final ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if(history.isEmpty()) {
            return 0.0;
        }
        
        double max = 0.0;
        for(Double status : history) {
            max = Math.max(status, max);
        }
        
        return max;
    }
    
    public double minValue() {
        if(history.isEmpty()) {
            return 0.0;
        }
        
        double min = Double.MAX_VALUE;
        
        for(Double status : history) {
            min = Math.min(status, min);
        }
        
        return min;
    }
    
    public double average() {
        if(history.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0;
        for(Double status : history) {
            sum += status;
        }
        return sum / history.size();
    }
}

