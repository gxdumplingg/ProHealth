package Controller;
import javax.swing.JOptionPane;

public class HealthReminder implements Runnable {
    public static final String reminderSound = "C:\\Users\\Admin\\Desktop\\Giang\\reminderSound.wav";
    private int standUpReminderCount = 0;
    private int lookFarReminderCount = 0;
    private int addWaterReminderCount = 0;
    @Override
    public void run() {
        
        JOptionPane.showMessageDialog(null, "Health Reminder Set", "Set Health Reminder", JOptionPane.INFORMATION_MESSAGE);
        while (true) {
            try {
                Thread.sleep(1 * 60 * 1000); // Chờ mỗi phút
                // nhắc nhở đứng dậy sau mỗi 30p
                standUpReminderCount++;
                if (standUpReminderCount == 30) {
                    new PlaySound(reminderSound);
                    JOptionPane.showMessageDialog(null, "Take a break! It's time to stand up and move around!", "Stand Up Reminder", JOptionPane.INFORMATION_MESSAGE);
                    standUpReminderCount = 0; // reset biến đếm
                }

         
                // nhắc nhở nhìn xa sau 10p
                lookFarReminderCount++;
                if (lookFarReminderCount == 10) {
                    new PlaySound(reminderSound);
                    JOptionPane.showMessageDialog(null, "Take a break! Look far away to get your eyes rested!", "Look Far Reminder", JOptionPane.INFORMATION_MESSAGE);
                    lookFarReminderCount = 0;
                }
                
                // nhắc nhở uống nước sau 60p
                addWaterReminderCount++;
                if (addWaterReminderCount == 60) {
                    new PlaySound(reminderSound);
                    JOptionPane.showMessageDialog(null, "Take a break! Get yourself a glass of water!", "Add Water Reminder", JOptionPane.INFORMATION_MESSAGE);
                    addWaterReminderCount = 0; // reset lại biến nhắc uống nước
                }
            } catch (InterruptedException ex) {
                    ex.printStackTrace();
            }
            
        }
    }
}