package Controller;

import Model.Alarm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.ArrayList;


public class AlarmController extends JFrame {
    private ArrayList<Alarm> alarmList;
    private boolean isTurned = false;
    public static final String sound = "C:\\Users\\Admin\\Desktop\\Giang\\mixkit-bells-of-summer-929.wav";


//    public static void playSound(String location) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
//        File musicFile = new File(location);
//        if (musicFile.exists()){
//            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioInputStream);
//            clip.start();
//        }
//    }
//    public static void playSound(String filepath) {
//        try {
//            File soundFile = new File(filepath);
//            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioIn);
//            clip.start();
//        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
//        }    
//    }
//    
    public AlarmController() {
        alarmList = new ArrayList<>();
        initializeUI();
    }
    
    private void initializeUI() {
        setTitle("Set Alarm");
        setSize(500,400);
        
        setBackground(Color.getHSBColor(102, 204, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL; // Cho phép mở rộng theo chiều ngang

        JLabel nameLabel = new JLabel("Alarm Name:");
        JTextField nameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField, gbc);

        JLabel timeLabel = new JLabel("Alarm Time (HH:mm):");
        JTextField timeField = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(timeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(timeField, gbc);

        JButton addButton = new JButton("Create Alarm");
        JButton editButton = new JButton("Edit Alarm");
        JButton deleteButton = new JButton("Delete Alarm");
        JButton viewButton = new JButton("View Alarm");

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(addButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(editButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(deleteButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(viewButton, gbc);

        JButton backButton = new JButton("Back");
        backButton.addActionListener((ActionEvent e) -> {
            dispose(); // Đóng cửa sổ hiện tại
            StartFrame startFrame = new StartFrame(); 
            startFrame.setVisible(true); 
        });

        // Panel chứa nút "Back"
        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.add(backButton);
        add(backButtonPanel, BorderLayout.NORTH);

        // Đặt panel chứa các thành phần còn lại vào phía dưới nút "Back"
        add(panel, BorderLayout.CENTER);

        addButton.addActionListener((ActionEvent e) -> {
            String alarmName = nameField.getText();
            String alarmTimeStr = timeField.getText();
            
            try {
                LocalTime alarmTime = LocalTime.parse(alarmTimeStr);
                Alarm newAlarm = new Alarm(alarmName, alarmTime);
                alarmList.add(newAlarm);
                
                JOptionPane.showMessageDialog(AlarmController.this, "Alarm added successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(AlarmController.this, "Invalid time format. Please use HH:mm format.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        editButton.addActionListener((ActionEvent e) -> {
            // Tạo một mảng chuỗi chứa thời gian của các báo thức
            StringBuilder message = new StringBuilder();
            String[] alarmTimes = new String[alarmList.size()];
            for (int i = 0; i < alarmList.size(); i++) {
                alarmTimes[i] = alarmList.get(i).getAlarmTime().toString();
            }
            if (alarmList.isEmpty()){
                message.append("No alarms set");
            }
            else {
                String selectedTime = (String) JOptionPane.showInputDialog(AlarmController.this,
                        "Select alarm time to edit:", "Edit Alarm", JOptionPane.QUESTION_MESSAGE,
                        null, alarmTimes, alarmTimes[0]);
                if (selectedTime != null) {
                    LocalTime selectedAlarmTime = LocalTime.parse(selectedTime);
                    String newTimeStr = JOptionPane.showInputDialog(AlarmController.this,
                            "Enter new time (HH:mm):", "Edit Alarm", JOptionPane.PLAIN_MESSAGE);
                    
                    try {
                        LocalTime newTime = LocalTime.parse(newTimeStr);
                        // Cập nhật thời gian mới
                        for (Alarm alarm : alarmList) {
                            if (alarm.getAlarmTime().equals(selectedAlarmTime)) {
                                alarm.setAlarmTime(newTime);
                                break;
                            }
                        }
                        
                        JOptionPane.showMessageDialog(AlarmController.this, "Alarm edited successfully!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(AlarmController.this, "Invalid time format. Please use HH:mm format.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
        deleteButton.addActionListener((ActionEvent e) -> {
            // Tạo một mảng chuỗi chứa thời gian của các báo thức
            String[] alarmTimes = new String[alarmList.size()];
            for (int i = 0; i < alarmList.size(); i++) {
                alarmTimes[i] = alarmList.get(i).getAlarmTime().toString();
            }
//                if (alarmList.isEmpty()){
//                    String message = (String) JOptionPane.showInputDialog(SetAlarmInterface.this, "No alarms set.");
//                }
//                else{

            String selectedTime = (String) JOptionPane.showInputDialog(AlarmController.this,
                    "Select alarm time to delete:", "Delete Alarm", JOptionPane.QUESTION_MESSAGE,
                    null, alarmTimes, alarmTimes[0]);
            if (selectedTime != null) {
                LocalTime selectedAlarmTime = LocalTime.parse(selectedTime);
                Alarm alarmToRemove = null;
                for (Alarm alarm : alarmList) {
                    if (alarm.getAlarmTime().equals(selectedAlarmTime)) {
                        alarmToRemove = alarm;
                        break;
                    }
                }

                if (alarmToRemove != null) {
                    alarmList.remove(alarmToRemove);
                    JOptionPane.showMessageDialog(AlarmController.this, "Alarm deleted successfully!");
                }
            }  
        });
            
        // action listener của View Button
        viewButton.addActionListener((ActionEvent e) -> {
            StringBuilder alarmInfo = new StringBuilder();
            if (alarmList.isEmpty()) {
                alarmInfo.append("No alarms set.");
            } else {
                alarmInfo.append("Alarm List:\n");
                for (Alarm alarm : alarmList) {
                    alarmInfo.append(alarm.getAlarmName()).append(" - ").append(alarm.getAlarmTime()).append("\n");
                }
            }
            JOptionPane.showMessageDialog(AlarmController.this, alarmInfo.toString(), "Alarm List", JOptionPane.INFORMATION_MESSAGE);
        });

        add(panel);
        setVisible(true);
//        pack();
        setLocationRelativeTo(null);
        // duyệt mỗi 1s
        Timer timer = new Timer(1000, (ActionEvent e) -> {
            boolean alarmActivated = false; // ktra xem có báo thức nào được kích hoạt không
            LocalTime currentTime = LocalTime.now();
            for (Alarm alarm : alarmList) {
                if (!alarm.isActivated() &&
                        alarm.getAlarmTime().getHour() == currentTime.getHour() &&
                        alarm.getAlarmTime().getMinute() == currentTime.getMinute()) {
                    alarm.setActivated(true); // báo thức được kích hoạt
                    alarmActivated = true;
//                    playSound(sound);
                    new PlaySound(sound);
                    // Show JOptionPane
                    SwingUtilities.invokeLater(() -> {
                        JOptionPane.showMessageDialog(AlarmController.this,
                                "Alarm: " + alarm.getAlarmName() + "\nTime: " + alarm.getAlarmTime(),
                                "Alarm", JOptionPane.INFORMATION_MESSAGE);
                    });
                }
            }

            // reset isTurned nếu không có báo thức nào được kích hoạt trong danh sách
            if (!alarmActivated) {
                isTurned = false;
            }
        });
        
        timer.start();
    }

    public static void main(String[] args) {
            
        SwingUtilities.invokeLater(() -> {
            new AlarmController();
        });
    }
}