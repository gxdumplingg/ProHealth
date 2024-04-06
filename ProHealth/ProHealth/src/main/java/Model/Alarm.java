    package Model;

import java.time.LocalTime;

public class Alarm {
    private String alarmName;
    private LocalTime alarmTime;
    private boolean activated; // Trạng thái kích hoạt của báo thức


    public Alarm(String alarmName, LocalTime alarmTime) {
        this.alarmName = alarmName;
        this.alarmTime = alarmTime;
        this.activated = false; // Mặc định khi tạo mới báo thức, chưa được kích hoạt

    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    
    public LocalTime getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    
    @Override
    public String toString() {
        return "Alarm Name: " + alarmName + ", Alarm Time: " + alarmTime.toString();
    }
}