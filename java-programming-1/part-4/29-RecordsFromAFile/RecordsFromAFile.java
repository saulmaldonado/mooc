
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name of the file: ");
        String filename = scanner.nextLine();
        System.out.println("");
        
        try {
            Scanner fileReader = new Scanner(Paths.get(filename));
            while(fileReader.hasNextLine()) {
                String[] fields = fileReader.nextLine().split(",");
                String name = fields[0];
                int age = Integer.valueOf(fields[1]);
                
                
                if(age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading from file " + filename);
        }

    }
}

