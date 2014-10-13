import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * defines all the instructions for creating a road at a specific y coordinate (although
 * it is designed for one y coordinate) in a single draw() method.
 * 
 * @author Fin Malone
 * @version October 07 2014
 */
public class Road
{
    /** y is the y coordinate of the road's top point.*/
    private static int y;

    /**
     * Default constructor for objects of class Road
     * @param y is the y coordinate assigned to the instance variable.
     */
    public Road(int y)
    {
       this.y = y;
    }

    /**
     * defines the gray assphalt base of the road and its yellow stripes and fills all of
     * them in.
     * 
     * @pre     this class will be called by the CityscapeCompontent class.
     * @post    the road will be created at the specific y coordinate.
     * @param    g2 the graphics context.
     * @return    VOID
     */
    public void draw(Graphics2D g2)
    {
        Rectangle asphalt = new Rectangle(0,this.y,1000,1000);
        
        Rectangle stripe1 = new Rectangle(50,this.y + 75,75,20);
        Rectangle stripe2 = new Rectangle(150,this.y + 75,75,20);
        Rectangle stripe3 = new Rectangle(250,this.y + 75,75,20);
        Rectangle stripe4 = new Rectangle(350,this.y + 75,75,20);
        Rectangle stripe5 = new Rectangle(450,this.y + 75,75,20);
        Rectangle stripe6 = new Rectangle(550,this.y + 75,75,20);
        Rectangle stripe7 = new Rectangle(650,this.y + 75,75,20);
        
        g2.setColor(Color.gray);
        g2.fill(asphalt);
        
        g2.setColor(Color.yellow);
        g2.fill(stripe1);
        g2.fill(stripe2);
        g2.fill(stripe3);
        g2.fill(stripe4);
        g2.fill(stripe5);
        g2.fill(stripe6);
        g2.fill(stripe7);
    }

}
