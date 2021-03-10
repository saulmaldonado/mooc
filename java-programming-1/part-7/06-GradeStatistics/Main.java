
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        int totalPassedPoints = 0;
        int totalPassedGrades = 0;
        
        int totalFailedPoints = 0;
        int totalFailedGrades = 0;
        
        int[] grades = new int[5];
        
        while(true) {
            int grade = scanner.nextInt();
            
            if(grade == -1) {
                break;
            }
            
            if(grade >= 0 && grade < 50) {
                totalFailedPoints += grade;
                totalFailedGrades++;
            } else if(grade >= 50 && grade <= 100){
                totalPassedPoints += grade;
                totalPassedGrades++;
                
                if(grade < 60) {
                    grades[4]++;
                } else if(grade < 70) {
                    grades[3]++;
                } else if(grade < 80) {
                    grades[2]++;
                } else if(grade < 90) {
                    grades[1]++;
                } else {
                    grades[0]++;
                }
            }
        }
        
        System.out.println("Point average (all): " + (double) (totalFailedPoints + totalPassedPoints) / (totalFailedGrades + totalPassedGrades));
        
        String passAvg;
        
        if(totalPassedGrades == 0) {
            passAvg = "-";
        } else {
            passAvg = "" + (double) totalPassedPoints / totalPassedGrades;
        }
        
        System.out.println("Point average (passing): " + passAvg);
        System.out.println("Pass percentage: " + (100.0 * totalPassedGrades / (totalPassedGrades + totalFailedGrades)));
        
        System.out.println("Grade distribution:");
        
        for(int i = 0; i < grades.length; i++) {
            System.out.print((5 - i) + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.print("0: ");
        for(int i = 0; i < totalFailedGrades; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}

