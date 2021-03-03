public class Timer {
    private final ClockHand seconds;
    private final ClockHand hundredth;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredth = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredth.advance();
        if(this.hundredth.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.seconds.toString() + ":" + this.hundredth.toString();
    }
}

