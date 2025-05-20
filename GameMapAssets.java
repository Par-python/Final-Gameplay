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
            int bgWidth = 4096;
            g.drawImage(gameMapAssets, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 2, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 3, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 4, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 5, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 6, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 7, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 8, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 9, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 10, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 11, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 12, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 13, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 14, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 15, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 16, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 17, 0, getWidth(), getHeight(), this);
            g.drawImage(gameMapAssets, bgWidth * 18, 0, getWidth(), getHeight(), this);
        }
    }
}
