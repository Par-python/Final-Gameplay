import java.awt.*;
import javax.swing.*;

public class GameBackground extends JComponent{
    private Image gameBackground;

    public GameBackground() {
        ImageIcon img = new ImageIcon("./assets/gameBackground.png");
        gameBackground = img.getImage();
        setBounds(0, 0, 1024, 768);
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameBackground != null) {
            g.drawImage(gameBackground, 0, 0, getWidth(), getHeight(), this);
        }
    }
}