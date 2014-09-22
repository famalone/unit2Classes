import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws a target.
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       Target target = new Target(200,200);
       
    }

    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
