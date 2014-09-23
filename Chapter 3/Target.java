import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
public class Target
{
    private int xLeft;
    private int yTop;
    private int diam;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x,int y,int diameter)
    {
        this.xLeft = x;
        this.yTop = y;
        this.diam = diameter;
    }

    public void draw(Graphics2D g2)
    {
        int hAndW1 = this.diam;
        Ellipse2D.Double redC1 = new Ellipse2D.Double(xLeft - hAndW1/2,yTop - hAndW1/2,hAndW1,hAndW1);
        int hAndW2 = this.diam - (this.diam/5);
        Ellipse2D.Double whiteC1 = new Ellipse2D.Double(xLeft - hAndW2/2,yTop - hAndW2/2,hAndW2,hAndW2);
        int hAndW3 = this.diam - ((this.diam/5) * 2);
        Ellipse2D.Double redC2 = new Ellipse2D.Double(xLeft - hAndW3/2,yTop - hAndW3/2,hAndW3,hAndW3);
        int hAndW4 = this.diam - ((this.diam/5) * 3);
        Ellipse2D.Double whiteC2 = new Ellipse2D.Double(xLeft - hAndW4/2,yTop - hAndW4/2,hAndW4,hAndW4);
        int hAndW5 = this.diam - ((this.diam/5) * 4);
        Ellipse2D.Double redC3 = new Ellipse2D.Double(xLeft - hAndW5/2,yTop - hAndW5/2,hAndW5,hAndW5);
        
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
