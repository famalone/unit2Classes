public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;
    private String state;
    
    public Door(String doorState, String doorName)
    {
        this.name = doorName;
        this.state = doorState;
    }

    public void close()
    {
        this.state = "closed";
    }

    public void open()
    {
        this.state = "open";
    }

    public String getState()
    {
        return this.state;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setState(String newState)
    {
        name = newState;
    }
    
}



