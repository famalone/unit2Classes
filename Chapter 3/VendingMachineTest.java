

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest
{
    private int x;

    public VendingMachineTest()
    {
    }
    

    @Before
    public void setUp()
    {
    }

    @Test
    public void testFillUp()
    {
        VendingMachine testVM = new VendingMachine();
        testVM.fillUp(20);
        int canAmount = testVM.getCanAmount();
        assertEquals(20,canAmount);
        
        testVM.fillUp(10);
        canAmount = testVM.getCanAmount();
        assertEquals(30,canAmount);
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine testVM = new VendingMachine();
        testVM.fillUp(20);
        testVM.insertToken();
        int canAmount = testVM.getCanAmount();
        int tokenAmount = testVM.getTokenAmount();
        assertEquals(19,canAmount);
        assertEquals(1,tokenAmount);
    }
    
    @After
    public void tearDown()
    {
    }

}
