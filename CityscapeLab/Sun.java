import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Defines all the instructions for creating the sun at a specific x and y integer in a single
 * draw() method.
 * 
 * @author Fin Malone
 * @version October 07 2014
 */
public class Sun
{
    /** diam is the diameter of the sun */
    private double diam;
    /**xLeft is the x coordinate of the sun*/
    private int xLeft;
    /**yTop is the y coordinate of the sun*/
    private int yTop;

    /**
     * Default constructor for objects of class Sun.
     * @param diameter,x,y are all assigned to the instance variables.
     */
    public Sun(double diameter,int x, int y)
    {
       this.diam = diameter;
       this.xLeft = x;
       this.yTop = y;
    }

    /**
     * defines a circle of class Ellipse2D.Double and fills it in yellow.
     * 
     * @pre     this class will be called by the CityscapeCompontent class.
     * @post    the sun will be created at the specific coordinates.
     * @param    g2 the graphics context.
     * @return    VOID
     */
    public void draw(Graphics2D g2)
    {
        //declares the height and width
        double hAndW = this.diam;
        
        Ellipse2D.Double sun = new Ellipse2D.Double(
        xLeft + (hAndW / 2),yTop - (hAndW / 2),hAndW,hAndW);
        
        g2.setColor(Color.yellow);
        g2.fill(sun);
    }

}
