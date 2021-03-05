
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private final String STOP_COMMAND = "end";
    private final String ADD_COMMAND = "add";
    private final String SEARCH_COMMAND = "search";
    
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals(STOP_COMMAND)) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals(ADD_COMMAND)) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dict.add(word, translation);
            } else if(command.equals(SEARCH_COMMAND)) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                String translation = dict.translate(word);
                if(translation == null) {
                    System.out.println("Word " + word + " was not found.");
                } else {
                    System.out.println("Translation:");
                    System.out.println(translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}

