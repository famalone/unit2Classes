

/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author Fin Malone
 * @version 12 September 2014
 */
public class Car
{
    /** fuel efficiency of the car measured in miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fule in gas tank in gallons*/
    private double fuelInTank;

    /** 
     * Constructor that specifies the fuel efficiency of this car
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * The drive method reduces the fuel in the tank based on the
     * specified miles and the efficiency of this car
     *
     * @pre        this method is never invoked with a value for miles
     *              that consumes more than the availiable gas in the tank.

     * @param   miles      number of miles driven
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles/this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }


    /**
     * Adds the specified amount of gas in gallons to this car's tank.
     *
     * @pre     the specified amount of gas that doesn't exceed the capacity of this
     *          cars tank
     * @param  gallons number of gallons of gas to add to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }


    /**
     * Returns the number of gallons of gas remaining in this car's tank.
     *
     *@return   number of gallons of gas remaining in this car's tank.
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}
