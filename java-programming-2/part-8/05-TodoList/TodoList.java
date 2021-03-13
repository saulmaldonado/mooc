
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        tasks.add(task);
    }
    
    public void print() {
        int number = 1;
        
        for(String task : tasks) {
            System.out.println(number + ": " + task);
            number++;
        }
        
    }
    
    public void remove(int number) {
        int i = number - 1;
        tasks.remove(i);
    }
}

