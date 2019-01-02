import Model.*;

import java.util.*;

import java.util.Map;

//会日日程安排问题
public class Schedule {
    public static List<Meeting> Calculation(List<Meeting> meetinglist) {
        List<Meeting> result = new ArrayList<Meeting>();
        Collections.sort(meetinglist);
        for (int i = 0; i < meetinglist.size(); i++) {
            Meeting currentMeeting = meetinglist.get(i);
            if (result.size() > 0) {
                Meeting rlastMeeting = result.get(result.size() - 1);
                if (rlastMeeting.getEndTime().compareTo(currentMeeting.getStartTime()) >= 0) {
                    continue;
                } else {
                    result.add(currentMeeting);
                }
            } else {
                result.add(currentMeeting);
            }
        }
        return result;
    }
}
