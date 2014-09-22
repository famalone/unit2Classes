import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
public class Target
{
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x,int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double redC1 = new Ellipse2D.Double(xLeft - 50,yTop - 50,100,100);
        Ellipse2D.Double whiteC1 = new Ellipse2D.Double(xLeft - 40,yTop - 40,80,80);
        Ellipse2D.Double redC2 = new Ellipse2D.Double(xLeft - 30,yTop - 30,60,60);
        Ellipse2D.Double whiteC2 = new Ellipse2D.Double(xLeft - 20,yTop - 20,40,40);
        Ellipse2D.Double redC3 = new Ellipse2D.Double(xLeft - 10,yTop - 10,20,20);
        
        g2.draw(redC1);
        g2.draw(whiteC1);
        g2.draw(redC2);
        g2.draw(whiteC2);
        g2.draw(redC3);
        
        g2.setColor(Color.red);
        g2.fill(redC1);
        g2.setColor(Color.white);
        g2.fill(whiteC1);
        g2.setColor(Color.red);
        g2.fill(redC2);
        g2.setColor(Color.white);
        g2.fill(whiteC2);
        g2.setColor(Color.red);
        g2.fill(redC3);
    }

}
