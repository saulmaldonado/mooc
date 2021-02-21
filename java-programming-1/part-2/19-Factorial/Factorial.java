
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        
        int number = scanner.nextInt();
        int counter = 1;
        
        int prod = 1;
        while(counter <= number) {
            prod *= counter;
            counter++;
        }
        
        System.out.println("Factorial: " + prod);

    }
}

