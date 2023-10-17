//import java.util.Comparator;

//implements Comparator<String> ??
public class Solution { 
    public Solution(String name, String word, int x, int y, Direction direction) {
        this.name = name;
        this.word = word;
        this.x = x;
        this.y = y;;
        this.direction = direction;
    }

   /* public int compare(String lhs, String rhs) {

    } */

    @Override
    public String toString() {
        return String.format("In %s: %s found at (%d,%d,%s)", name, word, x, y, direction);
    }

    private String name;
    private String word;
    private int x;
    private int y;
    private Direction direction;
}
