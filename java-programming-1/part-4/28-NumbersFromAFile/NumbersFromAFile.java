
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            List<Integer> numbers = new ArrayList<>();
            
            while(fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                
                if(number >= lowerBound && number <= upperBound) {
                    numbers.add(number);
                }
            }
            System.out.println("Numbers: " + numbers.size());
        } catch (Exception e) {
            System.out.println("Error reading from file " + file);
        }
        

    }

}

