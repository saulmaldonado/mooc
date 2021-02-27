import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed");
        String input = scanner.nextLine();
        
        if(input.trim().toLowerCase().equals("everything")) {
            for(Book book : books) {
                System.out.println(book.everything());
            }
        } else if(input.trim().toLowerCase().equals("name")) {
            for(Book book : books) {
                System.out.println(book.name());
            }
        }

    }
}

