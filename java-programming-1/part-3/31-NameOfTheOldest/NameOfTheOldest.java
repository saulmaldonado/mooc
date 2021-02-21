
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String oldestName = "";
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.isEmpty()) {
                break;
            }
            
            String[] values = input.split(",");
            
            String name = values[0];
            int age = Integer.valueOf(values[1]);
            
            if(age > oldest) {
                oldest = age;
                oldestName = name;
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);


    }
}

