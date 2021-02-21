
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int start = scanner.nextInt();
        
        System.out.println("Last number?");
        int end = scanner.nextInt();
        
        int sum = 0;
        
        while(start <= end) {
            sum += start;
            start++;
        }
        
        System.out.println("The sum is: " + sum);

    }
}

