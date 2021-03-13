
import java.util.HashMap;

public class Abbreviations {
    private final HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}

