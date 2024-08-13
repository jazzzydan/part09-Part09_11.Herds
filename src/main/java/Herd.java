import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> organisms;

    public Herd() {
        organisms = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : organisms) {
            result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : organisms) {
            movable.move(dx, dy);
        }
    }
}
