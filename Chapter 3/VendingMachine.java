
public class VendingMachine
{
    private int canAmount;
    private int tokenAmount;

    public VendingMachine()
    {
       this.canAmount = 10;
    }
    
    public VendingMachine(int cans)
    {
        this.canAmount = cans;
    }

    public void insertToken()
    {
       this.tokenAmount = this.tokenAmount + 1;
       this.canAmount = this.canAmount - 1;
    }
    
    public void fillUp(int cans)
    {
        this.canAmount = this.canAmount + cans;
    }
    
    public int getCanAmount()
    {
        int cans = this.canAmount;
        return cans;
    }
    
    public int getTokenAmount()
    {
        int tokens = this.tokenAmount;
        return tokens;
    }

}
