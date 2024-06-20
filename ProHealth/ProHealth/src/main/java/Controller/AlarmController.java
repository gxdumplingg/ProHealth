
package Controller;

import Model.Alarm;
import java.awt.Color;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class AlarmController extends javax.swing.JFrame {
    public static final String sound = "C:\\Users\\Admin\\Desktop\\Giang\\mixkit-bells-of-summer-929.wav";
    private  Timer timer;
    private ArrayList<Alarm> alarmList;
    public AlarmController() {
        initComponents();
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                dispose();
//            }
//        });
        setBackground(Color.WHITE);
        menuSideBar1.initMoving(AlarmController.this);
        alarmList = new ArrayList<>();
        timer = new Timer(1000, (java.awt.event.ActionEvent e) -> {
            checkAlarms();
        });
        timer.start();
        // Initialize the table model with columns
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        menuSideBar1 = new View.MenuSideBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addAlarmButton = new javax.swing.JButton();
        removeAlarmButton = new javax.swing.JButton();
        editAlarmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(menuSideBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 410, 300));

        addAlarmButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addAlarmButton.setText("Add");
        addAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlarmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addAlarmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 30));

        removeAlarmButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        removeAlarmButton.setText("Remove");
        removeAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAlarmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeAlarmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, 30));

        editAlarmButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        editAlarmButton.setText("Edit");
        editAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlarmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editAlarmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 354, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backgr.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlarmButtonActionPerformed
        String name = JOptionPane.showInputDialog(this, "Enter Alarm Name:");
    
    // Show the time input dialog in a loop until a valid time is entered
    String timeStr = null;
    boolean validTimeEntered = false;
    while (!validTimeEntered) {
        timeStr = JOptionPane.showInputDialog(this, "Enter Alarm Time (HH:mm):");
        
        if (timeStr == null) {
            // User pressed cancel, exit the loop
            return;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime time = LocalTime.parse(timeStr, formatter);
            Alarm newAlarm = new Alarm(name, time);
            alarmList.add(newAlarm);
            
            // Update the table
            updateAlarmTable();
            
            validTimeEntered = true; // Exit the loop if time is valid
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format. Please enter time in HH:mm format.");
        }
    }
    }//GEN-LAST:event_addAlarmButtonActionPerformed

    private void editAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlarmButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an alarm to edit.");
            return;
        }
        Alarm selectedAlarm = alarmList.get(selectedRow);
        String name = JOptionPane.showInputDialog(this, "Enter new alarm name:", selectedAlarm.getAlarmName());
 
        String timeStr = null;
        boolean validTimeEntered = false;
        while (!validTimeEntered) {
            timeStr = JOptionPane.showInputDialog(this, "Enter new alarm time (HH:mm):",
                selectedAlarm.getAlarmTime().format(DateTimeFormatter.ofPattern("HH:mm")));

            if (timeStr == null) {
                // User pressed cancel, exit the loop
                return;
            }

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime time = LocalTime.parse(timeStr, formatter);
                // Update selected alarm's information
                selectedAlarm.setAlarmName(name);
                selectedAlarm.setAlarmTime(time);

                // Reset activated state to false
                selectedAlarm.setActivated(false);

                // Update the table
                updateAlarmTable();

                validTimeEntered = true; // Exit the loop if time is valid
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Invalid time format. Please enter time in HH:mm format.");
            }
        }
    }//GEN-LAST:event_editAlarmButtonActionPerformed

    private void removeAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAlarmButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an alarm to remove.");
            return;
        }
        Alarm selectedAlarm = alarmList.get(selectedRow);

        int confirmResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this alarm?", 
                "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {
            alarmList.remove(selectedAlarm);
            updateAlarmTable();
        }
    }//GEN-LAST:event_removeAlarmButtonActionPerformed
    private void updateAlarmTable() {
        // Xóa dữ liệu cũ trên bảng
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Alarm alarm : alarmList) {
            Object[] row = {alarm.getAlarmName(), alarm.getAlarmTime(), alarm.isActivated()};
            model.addRow(row);
        }
        // Render the "Status" column with a tick for activated alarms
        for (int i = 0; i < model.getRowCount(); i++) {
            boolean activated = (boolean) model.getValueAt(i, 2);
            if (activated) {
                model.setValueAt(true, i, 2);
            }
        }
    }    

    private void checkAlarms() {
        LocalTime now = LocalTime.now();
        for (Alarm alarm : alarmList) {
            if (!alarm.isActivated() && now.getHour() == alarm.getAlarmTime().getHour() && now.getMinute() == alarm.getAlarmTime().getMinute()) {
                new PlaySound(sound);
                JOptionPane.showMessageDialog(this, "Alarm: " + alarm.getAlarmTime());
                alarm.setActivated(true); 
                
                updateAlarmTable();
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlarmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlarmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlarmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlarmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlarmController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAlarmButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton editAlarmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private View.MenuSideBar menuSideBar1;
    private javax.swing.JButton removeAlarmButton;
    // End of variables declaration//GEN-END:variables
}
