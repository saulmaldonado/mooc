
import java.util.Scanner;

public class UserInterface {
    private final TodoList todoList;
    private final Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            } else if(input.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            } else if(input.equals("list")) {
                todoList.print();
            } else if(input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = scanner.nextInt();
                todoList.remove(number);
            }
        }
    }
    
    
}

import java.util.Scanner;

public class UserInterface {
    private final TodoList todoList;
    private final Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            } else if(input.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            } else if(input.equals("list")) {
                todoList.print();
            } else if(input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = scanner.nextInt();
                todoList.remove(number);
            }
        }
    }
    
    
}

