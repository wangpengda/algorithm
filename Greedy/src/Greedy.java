import Model.Goods;
import Model.Meeting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//贪心算法主程序入口类
public class Greedy {

    public static void main(String[] args) throws ParseException {
        //背包问题
        List<Goods> goodsList = new ArrayList<Goods>();

//		goodsList.add(new Goods(5,15));
//		goodsList.add(new Goods(5,5));
//		goodsList.add(new Goods(2,8));
//		goodsList.add(new Goods(5,8));
//		goodsList.add(new Goods(4,6));
//		goodsList.add(new Goods(5,7));
//		goodsList.add(new Goods(5,6));
//		goodsList.add(new Goods(8,20));
//		goodsList.add(new Goods(4,3));
//		goodsList.add(new Goods(9,18));

        goodsList.add(new Goods(6, 18));
        goodsList.add(new Goods(7, 14));
        goodsList.add(new Goods(4, 16));
        goodsList.add(new Goods(3, 15));
        goodsList.add(new Goods(10, 25));

        double maxsize = 10;

        List<Goods> result = BackBag.Calculation(goodsList, maxsize);
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Size:" + result.get(i).getSize() + " Value:" + result.get(i).getValue());
        }

        //会议安排
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");

        List<Meeting> meetingList = new ArrayList<Meeting>();
        meetingList.add(new Meeting(df.parse("2018-12-18 01"), df.parse("2018-12-18 04")));
        meetingList.add(new Meeting(df.parse("2018-12-18 02"), df.parse("2018-12-18 05")));
        meetingList.add(new Meeting(df.parse("2018-12-18 03"), df.parse("2018-12-18 06")));
        meetingList.add(new Meeting(df.parse("2018-12-18 05"), df.parse("2018-12-18 07")));
        meetingList.add(new Meeting(df.parse("2018-12-18 03"), df.parse("2018-12-18 08")));
        meetingList.add(new Meeting(df.parse("2018-12-18 05"), df.parse("2018-12-18 09")));
        meetingList.add(new Meeting(df.parse("2018-12-18 06"), df.parse("2018-12-18 10")));
        meetingList.add(new Meeting(df.parse("2018-12-18 08"), df.parse("2018-12-18 11")));
        meetingList.add(new Meeting(df.parse("2018-12-18 08"), df.parse("2018-12-18 12")));
        meetingList.add(new Meeting(df.parse("2018-12-18 12"), df.parse("2018-12-18 14")));

        List<Meeting> resultmeeting = Schedule.Calculation(meetingList);
        for (int i = 0; i < resultmeeting.size(); i++) {
            System.out.println("Meeting" + i + " starttime:" + df.format(resultmeeting.get(i).getStartTime()) + " endtime:" + df.format(resultmeeting.get(i).getEndTime()));
        }
        System.out.println("Can arrang " + resultmeeting.size() + " meeting");
    }

}
