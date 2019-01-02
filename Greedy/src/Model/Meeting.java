package Model;

import java.time.Period;
import java.util.Date;

public class Meeting implements Comparable<Meeting> {
    private String Id;
    private Date StartTime;
    private Date EndTime;
    private int MeetLong;//会议时长 分钟

    public Meeting(Date startTime, Date endTime) {
        Id = java.util.UUID.randomUUID().toString();
        StartTime = startTime;
        EndTime = endTime;
        MeetLong = (int) ((endTime.getTime() - startTime.getTime()) / (1000 * 60 * 60));
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public int getMeetLong() {
        return MeetLong;
    }

    public void setMeetLong(int meetLong) {
        MeetLong = meetLong;
    }

    @Override
    public int compareTo(Meeting o) {
        return this.EndTime.compareTo(o.EndTime);
    }
}
