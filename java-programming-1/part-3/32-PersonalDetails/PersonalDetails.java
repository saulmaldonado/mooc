
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int len = 0;
        String longestName = "";
        int sumOfDates = 0;
        int numOfPeople = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.isEmpty()) {
                break;
            }
            
            String[] values = input.split(",");
            
            String name = values[0];
            int date = Integer.valueOf(values[1]);
            numOfPeople++;
            sumOfDates += date;
            
            if(name.length() > len) {
                longestName = name;
                len = name.length();
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)sumOfDates / numOfPeople));

    }
}

