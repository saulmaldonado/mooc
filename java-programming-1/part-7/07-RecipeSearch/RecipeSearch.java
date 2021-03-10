
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    private static final String LIST_COMMAND = "list";
    private static final String STOP_COMMAND = "stop";
    private static final String FIND_BY_NAME_COMMAND = "find name";
    private static final String FIND_BY_TIME_COMMAND = "find cooking time";
    private static final String FIND_BY_INGREDIENT_COMMAND = "find ingredient";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read:");
        String filename = scanner.nextLine();
        
        ArrayList<Recipe> recipes = readFile(filename);
        
        
        while(true) {
            System.out.println("Commands:");
            System.out.println(LIST_COMMAND + " - lists the recipes");
            System.out.println(STOP_COMMAND + " - stops the program");
            System.out.println(FIND_BY_NAME_COMMAND + " - searches recipes by name");
            System.out.println(FIND_BY_TIME_COMMAND + " - searches recipes by cooking time");
            System.out.println(FIND_BY_INGREDIENT_COMMAND + " - searches recipes by ingredient");
            
            System.out.print("Enter a command: ");
            String input = scanner.nextLine();
            
            if(input.equals(LIST_COMMAND)) {
                printRecipes(recipes);
                
            } else if(input.equals(STOP_COMMAND)) {
                break;
                
            } else if(input.equals(FIND_BY_NAME_COMMAND)) {

                System.out.print("Searched word:");
                String name = scanner.nextLine();

                ArrayList<Recipe> foundRecipes = searchRecipesByName(name, recipes);
                printRecipes(foundRecipes);

            } else if(input.equals(FIND_BY_TIME_COMMAND)) {
                System.out.print("Max cooking time:");
                int maxTime = scanner.nextInt();

                ArrayList<Recipe> foundRecipes = searchRecipesByTime(maxTime, recipes);
                printRecipes(foundRecipes);
            } else if(input.equals(FIND_BY_INGREDIENT_COMMAND)) {
                System.out.print("Ingredient:");
                String ingredient = scanner.nextLine();
                
                ArrayList<Recipe> foundRecipes = searchRecipesByIngredient(ingredient, recipes);
                printRecipes(foundRecipes);
                
            }
            
            System.out.println("");
        }

    }
    
    
    public static ArrayList<Recipe> readFile(String filename) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try {
            Scanner fileReader = new Scanner(Paths.get(filename));
            
            while(fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int time = Integer.valueOf(fileReader.nextLine());
                
                ArrayList<String> ingredients = new ArrayList<>();
                
                while(fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if(ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                
                recipes.add(new Recipe(name, time, ingredients));
            }
        } catch (IOException ex) {
            System.out.println("Error reading file");
        }
        
        return recipes;
    }
    
    public static ArrayList<Recipe> searchRecipesByName(String name, ArrayList<Recipe> recipes) {
        
        ArrayList<Recipe> found = new ArrayList<>();
        
        for(Recipe recipe : recipes) {
            if(recipe.getName().contains(name)) {
                found.add(recipe);
            }
        }
        
        return found;
    }
    
    public static ArrayList<Recipe> searchRecipesByTime(int maxTime, ArrayList<Recipe> recipes) {
        ArrayList<Recipe> found = new ArrayList<>();
        
        for(Recipe recipe : recipes) {
            if(recipe.getTime() <= maxTime) {
                found.add(recipe);
            }
        }
        
        return found;
    }
    
    public static ArrayList<Recipe> searchRecipesByIngredient(String ingredient, ArrayList<Recipe> recipes) {
        ArrayList<Recipe> found = new ArrayList<>();
        for(Recipe recipe : recipes) {
            if(recipe.searchIngredient(ingredient)){
                found.add(recipe);
            }
        }
        
        return found;
    }

    
    public static void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        
        for(Recipe recipe : recipes){
            System.out.println(recipe);
        }
    }

}

