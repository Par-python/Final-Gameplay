import java.awt.*;
import javax.swing.*;

public class GameMapCastle extends JComponent{
    private Image gameMapCastle;

    public GameMapCastle(){
        ImageIcon img = new ImageIcon("./assets/gameBackgrounStatic.png");
        gameMapCastle = img.getImage();
        setBounds(0, 0, 1024, 768);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameMapCastle != null) {
            g.drawImage(gameMapCastle, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
