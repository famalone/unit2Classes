import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Fin Malone
 * @version 07 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Links together all of the different classes to draw the city. Also draws the sky and ground without
     * calling an extra class.
     * @post    draws the entire city.
     * @param    g the Graphics object used to draw the city.
     * @return      VOID
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle sky = new Rectangle(0,0,1500,1500);
        g2.setColor(Color.blue);
        g2.fill(sky);
        
        Rectangle ground = new Rectangle(0,500,1000,1000);
        g2.setColor(Color.green);
        g2.fill(ground);
        
        Sun sun = new Sun(100,600,100);
        sun.draw(g2);
        
        Building building1 = new Building(200);
        building1.draw(g2);
        
        Road road = new Road(800);
        road.draw(g2);
    }

}
