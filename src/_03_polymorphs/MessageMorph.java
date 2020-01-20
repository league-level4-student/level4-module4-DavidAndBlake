package _03_polymorphs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MessageMorph extends Polymorph implements MouseListener
{
    MessageMorph(int x, int y, int width, int height)
    {
    super(x,y,width,height);
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 150, 30, 30);
    }

    public void update()
    {

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        JOptionPane.showMessageDialog(null,"Hello, I'm a program. Do you know Tron? I'm a big fan of his.");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        JOptionPane.showMessageDialog(null,"Hello, I'm a program. Do you know Tron? I'm a big fan of his");
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}
