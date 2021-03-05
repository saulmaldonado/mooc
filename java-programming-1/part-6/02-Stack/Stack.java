
import java.util.ArrayList;

public class Stack {
    ArrayList<String> list;
    
    public Stack() {
        list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public void add(String value) {
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return new ArrayList<>(list);
    }
    
    public String take() {
        return list.remove(list.size() - 1);
    }
}

