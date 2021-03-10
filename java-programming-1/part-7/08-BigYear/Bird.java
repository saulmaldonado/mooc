public class Bird {
    private final String name;
    private final String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLatinName() {
        return latinName;
    }
    
    public int getObservations() {
        return observations;
    }
    
    public void addObservation() {
        observations++;
    }
    
    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}

