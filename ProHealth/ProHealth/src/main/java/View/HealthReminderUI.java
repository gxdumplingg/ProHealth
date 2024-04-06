package View;

import Controller.AlarmController;
import Controller.PlaySound;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class HealthReminderUI extends javax.swing.JFrame {
    public static final String reminderSound = "C:\\Users\\Admin\\Desktop\\Giang\\reminderSound.wav";
    private AlarmController alarmController;
    public HealthReminderUI(){
        initComponents();
        jPanel1.setOpaque(false);
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        waterPanel.setOpaque(false);
        waterPanel.setBackground(new Color(0, 0, 0, 0));
        
        eyesRelaxPanel.setOpaque(false);
        eyesRelaxPanel.setBackground(new Color(0, 0, 0, 0));
        
        exercisePanel.setOpaque(false);
        exercisePanel.setBackground(new Color(0, 0, 0, 0));
    }
    public HealthReminderUI(AlarmController alarmController) {
        this.alarmController = alarmController;
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        waterButton = new javax.swing.JButton();
        eyesRelaxButton = new javax.swing.JButton();
        waterPanel = new javax.swing.JPanel();
        waterLabel1 = new javax.swing.JLabel();
        waterLabel2 = new javax.swing.JLabel();
        eyesRelaxPanel = new javax.swing.JPanel();
        eyesRelaxLabel = new javax.swing.JLabel();
        exerciseReminder = new javax.swing.JButton();
        exercisePanel = new javax.swing.JPanel();
        exerciseLabel = new javax.swing.JLabel();
        exerciseLabel2 = new javax.swing.JLabel();
        backIcon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        waterButton.setBackground(new java.awt.Color(204, 204, 204));
        waterButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        waterButton.setForeground(new java.awt.Color(0, 51, 51));
        waterButton.setText("Water Reminder");
        waterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterButtonActionPerformed(evt);
            }
        });

        eyesRelaxButton.setBackground(new java.awt.Color(204, 204, 204));
        eyesRelaxButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        eyesRelaxButton.setForeground(new java.awt.Color(0, 51, 51));
        eyesRelaxButton.setText("Eyes Relaxing ");
        eyesRelaxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyesRelaxButtonActionPerformed(evt);
            }
        });

        waterLabel1.setBackground(new java.awt.Color(102, 102, 102));
        waterLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        waterLabel1.setForeground(new java.awt.Color(51, 51, 51));
        waterLabel1.setText("Take a glass of water after every 60 minutes.");

        waterLabel2.setBackground(new java.awt.Color(255, 255, 255));
        waterLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        waterLabel2.setForeground(new java.awt.Color(51, 51, 51));
        waterLabel2.setText("Always remember to stay hydrated!");

        javax.swing.GroupLayout waterPanelLayout = new javax.swing.GroupLayout(waterPanel);
        waterPanel.setLayout(waterPanelLayout);
        waterPanelLayout.setHorizontalGroup(
            waterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(waterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waterLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        waterPanelLayout.setVerticalGroup(
            waterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(waterPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(waterLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waterLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        eyesRelaxLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        eyesRelaxLabel.setForeground(new java.awt.Color(51, 51, 51));
        eyesRelaxLabel.setText("Have your eyes relaxed after every 10 minutes.");

        javax.swing.GroupLayout eyesRelaxPanelLayout = new javax.swing.GroupLayout(eyesRelaxPanel);
        eyesRelaxPanel.setLayout(eyesRelaxPanelLayout);
        eyesRelaxPanelLayout.setHorizontalGroup(
            eyesRelaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eyesRelaxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eyesRelaxLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eyesRelaxPanelLayout.setVerticalGroup(
            eyesRelaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eyesRelaxPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(eyesRelaxLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        exerciseReminder.setBackground(new java.awt.Color(204, 204, 204));
        exerciseReminder.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        exerciseReminder.setForeground(new java.awt.Color(0, 51, 51));
        exerciseReminder.setText("Exercise Reminder");
        exerciseReminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exerciseReminderActionPerformed(evt);
            }
        });

        exerciseLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        exerciseLabel.setForeground(new java.awt.Color(51, 51, 51));
        exerciseLabel.setText("Stand up and move around after every 45 minutes.");

        exerciseLabel2.setBackground(new java.awt.Color(255, 255, 255));
        exerciseLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        exerciseLabel2.setForeground(new java.awt.Color(51, 51, 51));
        exerciseLabel2.setText("Get back to work after 5 minutes relaxing.");

        javax.swing.GroupLayout exercisePanelLayout = new javax.swing.GroupLayout(exercisePanel);
        exercisePanel.setLayout(exercisePanelLayout);
        exercisePanelLayout.setHorizontalGroup(
            exercisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exercisePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exercisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exerciseLabel)
                    .addComponent(exerciseLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exercisePanelLayout.setVerticalGroup(
            exercisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exercisePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(exerciseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exerciseLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(waterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exerciseReminder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exercisePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(eyesRelaxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eyesRelaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eyesRelaxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eyesRelaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exerciseReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(exercisePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        backIcon.setBackground(new java.awt.Color(204, 204, 204));
        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backIcon.png"))); // NOI18N
        backIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIconActionPerformed(evt);
            }
        });
        getContentPane().add(backIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backgr.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backIconActionPerformed
        this.dispose(); // Đóng frame HealthReminderUI
        alarmController.setVisible(true); // Hiển thị lại AlarmControllerTest
        alarmController.requestFocus(); // Yêu cầu focus để tránh lỗi không refresh JTable
    }//GEN-LAST:event_backIconActionPerformed

    private void waterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully set Water Reminder mode.");
        Timer timer = new Timer (60* 60* 1000, (ActionEvent e) -> {
            new PlaySound(reminderSound);
            JOptionPane.showMessageDialog(null, "Take a break! Get yourself a glass of water!");
        } // nhắc nhở uống nước sau 60 phút
        );
        timer.start();
    }//GEN-LAST:event_waterButtonActionPerformed

    private void exerciseReminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exerciseReminderActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully set Exercise Reminder mode.");
        Timer timer = new Timer (30* 60*  1000, (ActionEvent e) -> {
            new PlaySound(reminderSound);
            JOptionPane.showMessageDialog(null, "Stand up and take a break! You're working hard!");
        } // nhắc đứng dậy sau 30 phút
        );
        timer.start();
        Timer workingReminder = new Timer(20*1000, (ActionEvent e) -> {
            new PlaySound(reminderSound);
            JOptionPane.showMessageDialog(null, "It's time to get back to your work.");
        });
        workingReminder.start();
    }//GEN-LAST:event_exerciseReminderActionPerformed

    private void eyesRelaxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyesRelaxButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully set Eyes Relaxing mode.");
        Timer timer = new Timer (10* 60* 1000, (ActionEvent e) -> {
            new PlaySound(reminderSound);
            JOptionPane.showMessageDialog(null, "Take a break! Look far away from your screen for about 30 seconds!");
        } // nhắc nhở nhìn xa sau 10 phút
        );
        timer.start();
    }//GEN-LAST:event_eyesRelaxButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HealthReminderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthReminderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthReminderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthReminderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HealthReminderUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backIcon;
    private javax.swing.JLabel exerciseLabel;
    private javax.swing.JLabel exerciseLabel2;
    private javax.swing.JPanel exercisePanel;
    private javax.swing.JButton exerciseReminder;
    private javax.swing.JButton eyesRelaxButton;
    private javax.swing.JLabel eyesRelaxLabel;
    private javax.swing.JPanel eyesRelaxPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton waterButton;
    private javax.swing.JLabel waterLabel1;
    private javax.swing.JLabel waterLabel2;
    private javax.swing.JPanel waterPanel;
    // End of variables declaration//GEN-END:variables
}
