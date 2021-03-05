
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if(elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        } else if(elements.size() == 1) {
            return "The collection " + name + " has 1 element:\n" + elements.get(0); 
        }
        String[] lines = elements.toArray(new String[elements.size()]);
        return "The collection " + name + " has " + elements.size() + " elements:\n" + String.join("\n", lines);
    }
    
}

