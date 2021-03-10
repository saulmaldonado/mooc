
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    
    private static final String ADD_COMMAND = "Add";
    private static final String OBSERVATION_COMMAND = "Observation";
    private static final String ALL_COMMAND = "All";
    private static final String ONE_COMMAND = "One";
    private static final String QUIT_COMMAND = "Quit";
    

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        
        ArrayList<Bird> birds = new ArrayList<>();
        
        while(true) {
            
            System.out.print("?");
            String command = scan.nextLine();
            
            if(command.equals(ADD_COMMAND)) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                addBird(name, latinName, birds);
            } else if(command.equals(OBSERVATION_COMMAND)) {
                System.out.print("Bird?");
                String name = scan.nextLine();
                observeBird(name, birds);
            } else if(command.equals(ALL_COMMAND)) {
                printBirds(birds);
            } else if(command.equals(ONE_COMMAND)) {
                System.out.print("Bird?");
                String name = scan.nextLine();
                printOneBird(name, birds);
            } else if(command.equals(QUIT_COMMAND)) {
                break;
            }
        }
    }
    
    public static void addBird(String name, String latinName, ArrayList<Bird> birds) {
        if(name.trim().isEmpty() || latinName.trim().isEmpty()) {
            return;
        }
        birds.add(new Bird(name, latinName));
    }
    
    public static void observeBird(String name, ArrayList<Bird> birds) {
        if(name.trim().isEmpty()) {
            return;
        }
        
        Bird foundBird = searchBird(name, birds);
        
        if(foundBird != null) {
            foundBird.addObservation();
        }
    }
    
    public static void printBirds(ArrayList<Bird> birds) {
        for(Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public static void printOneBird(String name, ArrayList<Bird> birds) {
        if(name.trim().isEmpty()) {
            return;
        }
        
        Bird foundBird = searchBird(name, birds);
        
        if(foundBird != null) {
            System.out.println(foundBird);
        }
        
    }
    
    public static Bird searchBird(String name, ArrayList<Bird> birds) {
        for(Bird bird : birds) {
            if(bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
}

