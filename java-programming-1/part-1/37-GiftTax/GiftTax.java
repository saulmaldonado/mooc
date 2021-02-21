
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int value = Integer.valueOf(scan.nextLine());
        
        if(value < 5000) {
            System.out.println("No tax!");
        } else if(value >= 5000 && value < 25000) {
            int tax = 100;
            int lower = 5000;
            double rate = 0.08;
            System.out.println("Tax: " + (tax + (value - lower) * rate));
        } else if(value >= 25000 && value < 55000) {
            int tax = 1700;
            int lower = 25000;
            double rate = 0.1;
            System.out.println("Tax: " + (tax + (value - lower) * rate));
        } else if(value >= 55000 && value < 200000) {
            int tax = 4700;
            int lower = 55000;
            double rate = 0.12;
            System.out.println("Tax: " + (tax + (value - lower) * rate));

        } else if(value >= 200000 && value < 1000000) {
            int tax = 22100;
            int lower = 200000;
            double rate = 0.15;
            System.out.println("Tax: " + (tax + (value - lower) * rate));

        } else {
            int tax = 142100;
            int lower = 1000000;
            double rate = 0.17;
            System.out.println("Tax: " + (tax + (value - lower) * rate));
        }


    }
}

