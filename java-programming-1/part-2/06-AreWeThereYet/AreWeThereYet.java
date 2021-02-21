
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String res = "";
        
        while(!res.equals("4")) {
            System.out.println("Give a number:");
            res = scanner.nextLine();
        }

    }
}

