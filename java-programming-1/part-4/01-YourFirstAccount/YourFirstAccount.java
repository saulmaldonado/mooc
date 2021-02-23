
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account acc = new Account("my account", 100.00);
        
        acc.deposit(20.0);
        
        System.out.println(acc.toString());
    }
}

