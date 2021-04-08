
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    
    private static final String END_COMMAND = "end";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // Write your program here
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals(END_COMMAND)) {
                break;
            }
            inputs.add(input);
        }
        
        double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        
        System.out.println("average of the number: " + average);
    }
}

