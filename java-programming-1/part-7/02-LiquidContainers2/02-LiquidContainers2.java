
import java.util.Scanner;

public class LiquidContainers2 {

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
            
            String[] inputs = input.split(" ");
            
            String command = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            if(amount < 0) {
                continue;
            }
            
            if(command.equals("add")) {
                containerOne.add(amount);
            } else if(command.equals("move")) {
                if(amount > containerOne.contains()) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(amount);
                } else {
                    containerTwo.add(amount);
                    containerOne.remove(amount);
                }
            } else if(command.equals("remove")){
                containerTwo.remove(amount);
            }
        }
    }

}

