
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");
            
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
                containerOne += amount;
                if(containerOne > 100) {
                    containerOne = 100;
                }
            } else if(command.equals("move")) {
                if(containerOne < amount) {
                    containerTwo += containerOne;
                    containerOne = 0;
                } else {
                    containerTwo += amount;
                    containerOne -= amount;
                }

                if(containerTwo > 100) {
                    containerTwo = 100;
                }
            } else if(command.equals("remove")){
                if(amount > containerTwo) {
                    containerTwo = 0;
                } else {
                    containerTwo -= amount;
                }
            }
        }
    }

}

