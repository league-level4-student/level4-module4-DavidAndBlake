package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph
{
    private int x;
    private int y;
    private int width;
    private int height;


    Polymorph(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getWidth()
    {
        return width;
    }

    private void setWidth()
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    private void setHeight()
    {
        this.height = height;
    }

    public void update()
    {
    }

    public abstract void draw(Graphics g);
}
