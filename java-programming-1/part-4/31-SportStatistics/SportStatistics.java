
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String filename = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try {
            Scanner filereader = new Scanner(Paths.get(filename));
            int count = 0;
            int wins = 0;
            int losses = 0;
            
            while(filereader.hasNextLine()) {
                String[] fields = filereader.nextLine().split(",");
                
                String home = fields[0];
                String visitor = fields[1];
                
                if(home.equals(team) || visitor.equals(team)) {
                    count++;
                    
                    int homeScore = Integer.valueOf(fields[2]);
                    int visitorScore = Integer.valueOf(fields[3]);
                    
                    if(home.equals(team)) {
                        if(homeScore > visitorScore) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else {
                        if(homeScore > visitorScore) {
                            losses++;
                        } else {
                            wins++;
                        }
                    }
                }
            }
            
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("Error reading file " + filename);
        }
        

    }

}

