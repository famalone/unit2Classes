import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * defines all the instructions for creating a building on a specific x coordinate in a
 * single draw() method.
 * 
 * @author Fin Malone
 * @version October 07 2014
 */
public class Building
{
    /** xLeft is the x coordinate that the building's left wall will be placed at. */
    private static int xLeft;

    /**
     * Constructs a building with a given x value.
     * @param x the x value for the bottom left of the building
     */
    public Building(int x)
    {
        this.xLeft = x;
    }

    /**
     *defines a building body at a specific x coordinate then fills it in (black) and adds 4 
     *windows (Yellow) to the building's interior.
     *
     * @pre        this class will be called by the CityscapeCompontent class.
     * @post   The building will be created at the specified x coordinate and at the default
     * y coordinate of 350.
     * @param    g2 the graphics context.
     * @return    VOID
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(this.xLeft,350,225,400);
        
        Rectangle window1 = new Rectangle(this.xLeft + 50,400,50,50);
        Rectangle window2 = new Rectangle(this.xLeft + 50,475,50,50);
        Rectangle window3 = new Rectangle(this.xLeft + 125,400,50,50);
        Rectangle window4 = new Rectangle(this.xLeft + 125,475,50,50);
        
        g2.setColor(Color.black);
        g2.fill(body);
        
        g2.setColor(Color.orange);
        g2.fill(window1);
        g2.fill(window2);
        g2.fill(window3);
        g2.fill(window4);
    }

}
