package _03_polymorphs;

import java.awt.*;

public class MouseMorph extends Polymorph{

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    MouseMorph(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(MouseInfo.getPointerInfo().getLocation().x,MouseInfo.getPointerInfo().getLocation().y-screenSize.height/26,30,30);
    }
    public void update(){
        setX(MouseInfo.getPointerInfo().getLocation().x);
        setY(MouseInfo.getPointerInfo().getLocation().y);
    }
}

