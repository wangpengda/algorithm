package Model;

import java.util.List;

public class DijResult {
    private String[] Prev;
    private int[] Dist;

    public DijResult(String[] prev,int[] dist){
        this.Prev = prev;
        this.Dist = dist;
    }

    public String[] getPrev() {
        return Prev;
    }

    public void setPrev(String[] prev) {
        Prev = prev;
    }

    public int[] getDist() {
        return Dist;
    }

    public void setDist(int[] dist) {
        Dist = dist;
    }
}
