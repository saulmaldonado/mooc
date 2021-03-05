
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
       jokes.add(joke);
    }
    
    public String drawJoke() {
        if(jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int i = rand.nextInt(this.jokes.size());
        return this.jokes.get(i);
    }
    
    public void printJokes() {
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
}

