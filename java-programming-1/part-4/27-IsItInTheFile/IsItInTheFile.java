
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        List<String> names = new ArrayList<>();
        
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            
            while(fileReader.hasNextLine()) {
                names.add(fileReader.nextLine());
            }
        

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        if(names.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}

