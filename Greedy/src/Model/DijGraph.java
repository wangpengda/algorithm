package Model;

import java.util.*;

public class DijGraph {
    private List<String> Points;
    private  int[][] MatrixG;

    public List<String> getPoints() {
        return Points;
    }

    public void setPoints(List<String> points) {
        Points = points;
    }

    public int[][] getMatrixG () {
        return MatrixG;
    }

    public void setMatrixG (int[][] matricG) {
        MatrixG = matricG;
    }
}
