import java.util.*;
import Model.*;

//背包问题
public class BackBag {
    //贪心算法--背包问题
    public static List<Goods> Calculation(List<Goods> goodslist, double maxsize) {
        List<Goods> result = new ArrayList<Goods>();
        double baggoodssize = 0;
        if (goodslist != null && goodslist.size() > 0) {
            Collections.sort(goodslist);
        }
        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getSize() > maxsize)
                break;
            if ((baggoodssize + goodslist.get(i).getSize() > maxsize)) {
                break;
            } else {
                result.add(goodslist.get(i));
                baggoodssize += goodslist.get(i).getSize();
            }
        }
        return result;
    }
}

