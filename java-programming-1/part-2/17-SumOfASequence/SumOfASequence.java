
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int number = scanner.nextInt();
        
        int counter = 1;
        int sum = 0;
        
        while(counter <= number) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}

