
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations() {
        translations = new HashMap<>();
    }
    
    public ArrayList<String> translate(String word) {
        if(translations.containsKey(word)) {
            return translations.get(word);
        }
        return new ArrayList<>();
    }
    
    public void add(String word, String translation) {
        if(translations.containsKey(word)) {
            translations.get(word).add(translation);
        } else {
            translations.put(word, new ArrayList<>(Arrays.asList(translation)));
        }
    }
    
    public void remove(String word) {
        translations.remove(word);
    }
}

