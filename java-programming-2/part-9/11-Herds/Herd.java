
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private final List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        movables.add(movable);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Movable moveable : movables) {
            sb.append(moveable.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable moveable : movables) {
            moveable.move(dx, dy);
        }
    }
}

