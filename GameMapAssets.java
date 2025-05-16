import java.awt.*;
import javax.swing.*;

public class GameMapAssets extends JComponent {
    private Image gameMapAssets;
    
    public GameMapAssets(){
        ImageIcon img = new ImageIcon("./assets/gameMapAssets.png");
        gameMapAssets = img.getImage();
        setBounds(0, 0, 4096, 768);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameMapAssets != null) {
            g.drawImage(gameMapAssets, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
