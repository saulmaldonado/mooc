
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        while(counter <= number) {
            System.out.println(counter);
            counter++;
        }

    }
}

