package _03_polymorphs;

import java.awt.*;

public class MovingMorph extends Polymorph
{
    private int screenWidth; //This wasn't part of the original program. I put it in to use in the update method because
    // I have no idea how I'm going to make objects move around the screen without it.
    private int forwardX;//I put this here to make the objects consistently move forward. As long as forwardX = true, the polymorph objects will move forward.

    MovingMorph(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(getX(), getY(), 30, 30);
    }

    @Override
    public void update()
    {
        int x = getX();
        x++;
        setX(x);

        int y = getY();
        y++;
        setY(y);


    }
}
