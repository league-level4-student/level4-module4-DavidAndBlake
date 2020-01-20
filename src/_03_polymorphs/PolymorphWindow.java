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
    Polymorph circleMorph;
    Polymorph mouseMorph;
    Polymorph imageMorph;
    Polymorph messageMorph;
    ArrayList<Polymorph> polymorphArray = new ArrayList<Polymorph>();
    private Object MessageMorph;

    public static void main(String[] args)
    {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow()
    {
        bluePoly = new BluePolymorph(130, 130, 30, 30);
        redPoly = new RedPolymorph(170, 130, 30, 30);
        movingMorph = new MovingMorph(80,150,30,30);
        circleMorph = new CircleMorph(150,150,30,30);
        mouseMorph = new MouseMorph(0,322,20,20);
        imageMorph = new ImageMorph(300,40,50,50);
        messageMorph = new MessageMorph(0,50,30,30);

        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.addMouseListener((MessageMorph)messageMorph);
        window.setVisible(true);
        polymorphArray.add(bluePoly);
        polymorphArray.add(redPoly);
        polymorphArray.add(movingMorph);
        polymorphArray.add(circleMorph);
        polymorphArray.add(mouseMorph);
        polymorphArray.add(imageMorph);
        polymorphArray.add(messageMorph);
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
        for (Polymorph p : polymorphArray)
        {
            p.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        repaint();
        for (Polymorph p:polymorphArray){
            p.update();
        }
    }
}
