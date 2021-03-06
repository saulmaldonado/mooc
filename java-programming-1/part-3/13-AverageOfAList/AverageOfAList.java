
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int count = 0;
        int sum = 0;
        
        while(true) {
            int number = scanner.nextInt();
            
            if(number == -1){
                break;
            }
            
            count++;
            sum += number;
        }
       
        System.out.println("Average: " + ((double)sum / count));
    }
}

