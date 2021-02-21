
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String res = "";
        
        while(!(res.equals("no"))) {
            System.out.println("Shall we carry on?");
            res = scanner.nextLine();
        }
    }
}

