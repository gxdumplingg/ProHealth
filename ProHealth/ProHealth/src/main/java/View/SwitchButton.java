package View;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class SwitchButton extends Component{
    private Timer timer;
    private float location, speed = 1f;
    private boolean selected, mouseOver;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        timer.start();
    }
    public SwitchButton(){
        setBackground(new Color(29, 138, 125));
        setPreferredSize(new Dimension(50, 25));
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        location = 2;
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selected){
                    int endLocation = getWidth() - getHeight();
                    if (location < endLocation){
                        location += speed;
                        repaint();
                    }
                    else {
                        timer.stop();
                        location = endLocation;
                        repaint();
                    }
                }
                else {
                    int endLocation = 2;
                    if (location > endLocation){
                        location -= speed;
                        repaint();
                    }
                    else {
                        timer.stop();
                        location = endLocation;
                        repaint();
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)){
                    if (mouseOver){
                        selected = !selected;
                        timer.start();
                     
                    }
                }
            }
            
            
        });
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        float alpha = getAlpha();
        if (alpha < 1){
            g2d.setColor(Color.GRAY);
            g2d.fillRoundRect(0, 0, width, height, 25, 25);
        }
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, width, height, 25, 25);
        g2d.setColor(getForeground());
        g2d.setComposite(AlphaComposite.SrcOver);
        g2d.fillOval((int)location, 2, height-4, height-4);
        super.paint(g); 
    }
    private float getAlpha(){
        float width = getWidth() - getHeight();
        float alpha = (location-2)/width;
        if (alpha < 0)  alpha = 0;
        if (alpha > 1)  alpha = 1;
        return alpha;
    }

    
}
