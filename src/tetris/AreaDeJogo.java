package tetris;

import java.awt.Graphics;
import javax.swing.JPanel;

public class AreaDeJogo extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(10, 10, 200, 200);
    }
}
