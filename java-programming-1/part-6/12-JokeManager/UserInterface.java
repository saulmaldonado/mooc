
import java.util.Scanner;

public class UserInterface {
    
    private final String END_COMMAND = "X";
    private final String ADD_COMMAND = "1";
    private final String DRAW_COMMAND = "2";
    private final String PRINT_COMMAND = "3";
    
    private final Scanner scanner;
    private final JokeManager jokeManager;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
            
            if(command.equals(ADD_COMMAND)) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if(command.equals(DRAW_COMMAND)) {
                System.out.println("Drawing a joke");
                String joke = jokeManager.drawJoke();
                System.out.println(joke);
            } else if(command.equals(PRINT_COMMAND)) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            } else if(command.equals(END_COMMAND)) {
                break;
            }
        }
    }
}

