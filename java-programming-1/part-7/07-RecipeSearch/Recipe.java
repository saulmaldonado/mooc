
import java.util.ArrayList;

public class Recipe {
    
    private final String name;
    private final int time;
    private final ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTime() {
        return time;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public boolean searchIngredient(String searchedIngredient) {
        for(String ingredient : ingredients) {
            if(ingredient.equals(searchedIngredient)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return name + ", cooking time: " + time;
    }
}

