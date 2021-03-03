public class Item {
    private final String identifier;
    private final String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item itemCompared = (Item)compared;
        
        return (
                (identifier.equals(itemCompared.identifier) &&
                name.equals(itemCompared.name) || this.isDuplicate(itemCompared))
        );
    }
    
    public boolean isDuplicate(Item compared) {
        return identifier.equals(compared.identifier);
    }
    
    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}

