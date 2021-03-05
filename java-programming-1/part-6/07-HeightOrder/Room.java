
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return new ArrayList<>(persons);
    }
    
    public Person shortest() {
        if(isEmpty()) {
            return null;
        }
        Person toReturn = persons.get(0);
        
        for(Person person : persons) {
            if(person.getHeight() < toReturn.getHeight()) {
                toReturn = person;
            }
        }
        return toReturn;
    }
    
    public Person take() {
        if(isEmpty()) {
            return null;
        }
        
        Person personToRemove = shortest();
        persons.remove(personToRemove);
        return personToRemove;
    }
}

