
import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container containerOne = new Container();
        Container containerTwo = new Container();
        
        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(amount < 0) {
                continue;
            }
            
            if(command.equals("add")) {
                containerOne.add(amount);
            } else if(command.equals("move")) {
                int waterToMove = containerOne.remove(amount);
                containerTwo.add(waterToMove);
            } else if(command.equals("remove")){
                containerTwo.remove(amount);
            }
        }
    }
}

