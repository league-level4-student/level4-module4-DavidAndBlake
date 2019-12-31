package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener
{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;

    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingMorph;
	ArrayList<Polymorph> polymorphArray;

    public static void main(String[] args)
    {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow()
    {
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
		polymorphArray.add(bluePoly);
		polymorphArray.add(redPoly);
		polymorphArray.add(movingMorph);
//        bluePoly = new BluePolymorph(34, 34, 34,34);
//        redPoly = new RedPolymorph(194, 34, 34,34);
//        movingMorph = new MovingMorph(getX(),getY(),getWidth(),getHeight());

        timer = new Timer(1000 / 30, this);
        timer.start();
    }

    public void paintComponent(Graphics g)
    {
        //draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);
        //draw polymorph
//        bluePoly.draw(g);
//        redPoly.draw(g);
//        movingMorph.draw(g);
        for (Polymorph p: polymorphArray)
        {
 bluePoly.draw(g);
 redPoly.draw(g);
 movingMorph.draw(g);
 bluePoly.update();
 redPoly.update();
 movingMorph.update();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        repaint();
//        bluePoly.update();
//        redPoly.update();
//        movingMorph.update();
    }
}
