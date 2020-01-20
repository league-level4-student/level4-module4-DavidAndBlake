package _03_polymorphs;

import java.awt.*;

public class CircleMorph extends Polymorph
{
    int angle = 0;
    CircleMorph(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }
    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(getX(), getY(), 30, 30);
    }
    public void update()
    {
        setX((int)(getX()+Math.cos(angle)*50));
        setY((int)(getY()+Math.sin(angle)*50));
        angle++;
    }
}
