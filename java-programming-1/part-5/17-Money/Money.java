
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        return new Money(euros + addition.euros, cents + addition.cents);
    }
    
    public boolean lessThan(Money compared) {
        if(euros < compared.euros) {
            return true;
        }
        
        if(euros == compared.euros) {
            return cents < compared.cents;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser) {
        
        int balance = (euros * 100) + cents;
        int decreaserBalance = (decreaser.euros * 100) + decreaser.cents;
        
        int newBalance = balance - decreaserBalance;
        
        if(newBalance < 0) {
            return new Money(0, 0);
        }
        
        int newEuros = newBalance / 100;
        int newCents = newBalance % 100;
        
        return new Money(newEuros, newCents);
    }

}

