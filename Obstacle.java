import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Obstacle {
    
    private double x, y;
    private BufferedImage obstacle;
    private String[] imageName;

    public Obstacle(double a, double b){
        x = a;
        y = b;
        imageName = new String[8];
        randomObstacleImage();
    }

    public void randomObstacleImage(){
        try {
            for(int i = 0; i < 8; i++){
                String fileName = "obstacle" + (i + 1) + ".png";
                imageName[i] = fileName;
            }
            int randomImageNumber = (int)(Math.random() * 9);
            String chosenFile = imageName[randomImageNumber];

            obstacle = ImageIO.read(getClass().getResourceAsStream(chosenFile));

        } catch(IOException ex){
            System.out.println("BRO DID NOT FIND IT");
        }
    }

    public BufferedImage pokeImage(){
        return obstacle;
    }

    public void drawSprite(Graphics2D g2d){
        int newX = (int) x;
        int newY = (int) y;
        g2d.drawImage(obstacle, newX, newY, null);
    }

    public double getX(){
        return x;
    }
}
