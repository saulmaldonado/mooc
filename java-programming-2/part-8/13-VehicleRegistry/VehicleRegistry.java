
import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> plates;
    
    public VehicleRegistry() {
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(!plates.containsKey(licensePlate)) {
            plates.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        return plates.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(plates.containsKey(licensePlate)){
            plates.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate plate : plates.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        HashSet<String> owners = new HashSet<>();
        
        for(String owner : plates.values()) {
            owners.add(owner);
        }
        
        for(String owner : owners) {
            System.out.println(owner);
        }
    }
}

