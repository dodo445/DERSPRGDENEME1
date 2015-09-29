package dogukan.dersprgdeneme1.pages.mainpage.model;

/**
 * Created by Panch on 29.09.2015.
 */
public class EventModel {




    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String startTime;
    private String endTime;
    private String title;
    private boolean notify;

}
