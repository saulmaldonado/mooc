
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            System.out.println("");
            
            if(firstName.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.println("");
            
            System.out.print("Identification number: ");
            String ID = scanner.nextLine();
            System.out.println("");
            
            infoCollection.add(new PersonalInformation(firstName, lastName, ID));
        }
        
        for(PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}

