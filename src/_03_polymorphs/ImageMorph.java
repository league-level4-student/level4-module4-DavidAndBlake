package _03_polymorphs;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageMorph extends Polymorph
{
    BufferedImage image;

    ImageMorph(int x, int y, int imageWidth, int imageHeight){
        super(x,y,imageWidth,imageHeight);
        try{
            image = ImageIO.read(this.getClass().getResourceAsStream("fall-wallpaper-20.jpg"));
        }
        catch (Exception e){
        }
    }

    @Override
    public void draw(Graphics g)
    {
        g.drawImage(image,0,0,120,120,null);
    }

}
