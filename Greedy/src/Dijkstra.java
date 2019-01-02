import Model.*;

import java.util.*;

//迪杰斯特拉算法
public class Dijkstra {
    public static final int MAX_DISTANCE = 9999999;

    public static DijResult Calculation(DijGraph g, String p) {

        List<String> graphpoints = g.getPoints();
        if (!graphpoints.contains(p)) return null;//判断是否是图中的点，不是即返回null

        int[][] matrixG = g.getMatrixG();

        boolean[] checkflag = new boolean[graphpoints.size()];
        String[] prev = new String[graphpoints.size()];
        int[] dist = new int[graphpoints.size()];

        int indexofp = graphpoints.indexOf(p);
        for (int i = 0; i < checkflag.length; i++) {
            checkflag[i] = false;//初始化检查数组
            dist[i] = Math.min(MAX_DISTANCE, matrixG[indexofp][i]);//初始化距离数组
        }

        checkflag[indexofp] = true;//初始化原点P对应的检查数据
        dist[indexofp] = 0;//初始化原点P对应的距离数组

        int nearindex = indexofp;
        for (int i = 0; i < graphpoints.size(); i++) {
            int min = MAX_DISTANCE;
            //在没有找过的剩下的点中，循环取距离当前点最近的点
            for (int j = 0; j < graphpoints.size(); j++) {
                if (checkflag[j] == false && dist[j] < min) {
                    min = dist[j];
                    nearindex = j;
                }
            }

            for (int j = 0; j < graphpoints.size(); j++) {
                //对比上一个节点 和 最短距离数组，更新数组
                int tmpdist = Math.min(MAX_DISTANCE, min + matrixG[nearindex][j]);
                if (checkflag[j] == false && tmpdist < dist[j]) {
                    dist[j] = tmpdist;
                    prev[j] = graphpoints.get(nearindex);
                }
            }
        }

        return new DijResult(prev,dist);
    }
}
