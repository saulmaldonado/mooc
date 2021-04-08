
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    private static final String END_COMMAND = "end";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals(END_COMMAND)) {
                break;
            }
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String opt = scanner.nextLine();
        
        double avg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> {
                    if(opt.equals("n")) {
                        return n < 0;
                    }
                    return n > 0;
                })
                .average()
                .orElse(0.0);
                
        
        if(opt.equals("n")) {
            System.out.println("Average of the negative numbers: " + avg);
        } else {
            System.out.println("Average of the positive number: " + avg);
        }
        
    }
}

