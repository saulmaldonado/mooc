
import java.util.Scanner;

public class UserInterface {
    private final String STOP_COMMAND = "stop";
    private final String ADD_COMMAND = "add";
    private final String LIST_COMMAND = "list";
    private final String REMOVE_COMMAND = "remove";
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals(STOP_COMMAND)) {
                break;
            } else if(command.equals(ADD_COMMAND)) {
                System.out.println("To Add:");
                String task = scanner.nextLine();
                todoList.add(task);
            } else if(command.equals(LIST_COMMAND)) {
                todoList.print();
            } else if(command.equals(REMOVE_COMMAND)) {
                System.out.println("Which one is removed?");
                int id = Integer.valueOf(scanner.nextLine());
                todoList.remove(id);
            }
        }
    }
}

