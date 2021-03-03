
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public SimpleDate(SimpleDate date) {
        this(date.day, date.month, date.year);
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        day++;
        if(day > 30) {
            day = 1;
            month++;
            if(month > 12) {
                month = 1;
                year++;
            }
        }
    }
    
    public void advance(int howManyDays) {
        if(howManyDays >= 365) {
            year += howManyDays / 365;
            howManyDays %= 365;
        }
        
        if(howManyDays >= 30) {
            month += howManyDays / 30;
            if(month > 12) {
                month = 1;
                year++;
            }
            howManyDays %= 30;
        }
        
        day += howManyDays;
        
        if(day > 30) {
            day -= 30;
            
            month++;
            if(month > 12) {
                month = 1;
                year++;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this);
        newDate.advance(days);
        return newDate;
    }
}

