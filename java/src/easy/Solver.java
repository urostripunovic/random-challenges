package easy;
import java.util.*;

public interface Solver {
    public void setup(int size, int m);

    public default List<Square> solve(int[][] matrix, int m) {
        List<Square> list = new ArrayList<>();
        

        return list;
    }

    public class Square {
        private int row, col, size;

        public Square(int row, int col, int size) {
            this.row = row;
            this.col = col;
            this.size = size;
        }
    }
}
