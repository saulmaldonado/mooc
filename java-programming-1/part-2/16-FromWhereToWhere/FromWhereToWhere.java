
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int number = scanner.nextInt();
        
        System.out.println("Where from?");
        int counter = scanner.nextInt();
        
        while(counter <= number) {
            System.out.println(counter);
            counter++;
        }
    }
}

