import java.awt.*;
import javax.swing.*;

public class GameMapClouds extends JComponent {
    private Image gameMapClouds;
    
    public GameMapClouds(){
        ImageIcon img = new ImageIcon("./assets/gameMapClouds.png");
        gameMapClouds = img.getImage();
        setBounds(0, 0, 4096, 768);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameMapClouds != null) {
            g.drawImage(gameMapClouds, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
