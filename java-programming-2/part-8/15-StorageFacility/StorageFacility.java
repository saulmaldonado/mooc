
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility() {
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if(units.containsKey(unit)) {
            units.get(unit).add(item);
        } else {
            units.put(unit, new ArrayList<>(Arrays.asList(item)));
        } 
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if(units.containsKey(storageUnit)) {
            units.get(storageUnit).remove(item);
            if(units.get(storageUnit).isEmpty()) {
                units.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsList = new ArrayList<>();
        
        for(String unit : units.keySet()) {
            unitsList.add(unit);
        }
        
        return unitsList;
    }
}

