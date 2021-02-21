
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        int counter = number;
        while(counter <= 100) {
            System.out.println(counter);
            counter++;
        }
    }
}

