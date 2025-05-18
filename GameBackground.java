import java.awt.*;
import javax.swing.*;

public class GameBackground extends JComponent{
    private Image gameBackground1;
    private Image gameBackground2;
    private Image gameBackground3;
    private Image gameBackground4;
    private Image gameBackground5;

    public GameBackground() {
        ImageIcon img1 = new ImageIcon("./assets/gameBackground.png");
        ImageIcon img2 = new ImageIcon("./assets/gameBackground2.png");
        ImageIcon img3 = new ImageIcon("./assets/gameBackground3.png");
        ImageIcon img4 = new ImageIcon("./assets/gameBackground4.png");
        ImageIcon img5 = new ImageIcon("./assets/gameBackground5.png");
        gameBackground1 = img1.getImage();
        gameBackground2 = img2.getImage();
        gameBackground3 = img3.getImage();
        gameBackground4 = img4.getImage();
        gameBackground5 = img5.getImage();
        setBounds(0, 0, 4096, 768);
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameBackground1 != null) {
            int bgWidth = 4096;
            g.drawImage(gameBackground1, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground2, bgWidth, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground3, bgWidth * 2, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground4, bgWidth * 3, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground5, bgWidth * 4, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground3, bgWidth * 5, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground4, bgWidth * 6, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground5, bgWidth * 7, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground2, bgWidth * 8, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground3, bgWidth * 9, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground4, bgWidth * 10, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground5, bgWidth * 11, 0, getWidth(), getHeight(), this);
            g.drawImage(gameBackground3, bgWidth * 12, 0, getWidth(), getHeight(), this);
        }
    }
}