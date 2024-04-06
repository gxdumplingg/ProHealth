
package View;

import View.HealthReminderUI;
import Controller.AlarmController;
import Model.ModelMenu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MenuSideBar extends javax.swing.JPanel {
    private DefaultTableModel tableModel;
    private AlarmController alarmController;

    public MenuSideBar() {
        initComponents();
        setOpaque(false);
        listMenu.setOpaque(false);
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Alarm Name");
        tableModel.addColumn("Alarm Time");
        tableModel.addColumn("Status");
        init();
    }
    private void init(){
        listMenu.addItem(new ModelMenu("Set Alarm", ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("Reminder", ModelMenu.MenuType.MENU));
        listMenu.addItem(new ModelMenu("Exit", ModelMenu.MenuType.MENU));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMenu = new Model.ListMenu<>();
        jLabel2 = new javax.swing.JLabel();
        movingPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        setAlarmButton = new javax.swing.JButton();
        reminderButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(listMenu);

        jLabel2.setText("jLabel2");

        movingPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home2.png"))); // NOI18N
        jLabel1.setText("ProHealth");

        sidePanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout movingPanelLayout = new javax.swing.GroupLayout(movingPanel);
        movingPanel.setLayout(movingPanelLayout);
        movingPanelLayout.setHorizontalGroup(
            movingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(movingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        movingPanelLayout.setVerticalGroup(
            movingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movingPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        setAlarmButton.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        setAlarmButton.setText("Set Alarm");
        setAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAlarmButtonActionPerformed(evt);
            }
        });

        reminderButton.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        reminderButton.setText("Health Reminder");
        reminderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(movingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setAlarmButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reminderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(movingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setAlarmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAlarmButtonActionPerformed
//        alarmController.setVisible(true); // Hiển thị AlarmControllerTest khi nhấn Set Alarm
//        alarmController.requestFocus(); // Yêu cầu focus để tránh lỗi không refresh JTable
            new AlarmController();
    }//GEN-LAST:event_setAlarmButtonActionPerformed

    private void reminderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderButtonActionPerformed
        HealthReminderUI healthReminderUI = new HealthReminderUI();
        healthReminderUI.setLocationRelativeTo(null);
        // Hiển thị giao diện HealthReminderUI
        healthReminderUI.setVisible(true);
    }//GEN-LAST:event_reminderButtonActionPerformed
  
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new StartScreen().setVisible(true);
        });
    }
    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D  g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.decode("#304352"), 0, getHeight(), Color.decode("#d7d2cc"));
        g2d.setPaint(gradientPaint);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2d.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }
    
    private int x, y;
    public void initMoving(JFrame frame){
        movingPanel.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
               x = e.getX();
               y = e.getY();
            }
        });
        movingPanel.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen()-x, e.getYOnScreen()-y);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Model.ListMenu<String> listMenu;
    private javax.swing.JPanel movingPanel;
    private javax.swing.JButton reminderButton;
    private javax.swing.JButton setAlarmButton;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
