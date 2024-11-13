public class Location2
{
    private String name;
    private double xcoord;
    private double ycoord;

    /* Constructor */
    public Location2(String name, double xcoord, double ycoord)
    {
        this.name = name;
        this.xcoord = xcoord;
        this.ycoord = ycoord;
    }

    /* toString is REQUIRED, REALLY IMPORTANT for command System.out.println(uni) which prints University(2.45,100.3) */
    // The reason this has String (or Int or double) next to public because it returns a value, look at public Location,
    // it doesnt have specific data type since it only stores
    public String toString()
    {
        return this.name + "(" + this.xcoord + ", " + this.ycoord + ")";
    }

    /* Getters */
    public String getName()
    {
        return this.name;
    }

    public double getXcoord()
    {
        return this.xcoord;
    }

    public double getYcoord()
    {
        return this.ycoord;
    }

    /* Setters */
    public void setName(String name)
    {
        this.name = name;
    }

    public void setXcoord(double xcoord)
    {
        this.xcoord = xcoord;
    }

    public void setYcoord(double ycoord)
    {
        this.ycoord = ycoord;
    }

    public void moveTo(double xcoord, double ycoord)
    {
        this.xcoord = xcoord;
        this.ycoord = ycoord;
    }

    // the reason why other is after and not before Location because it is an aspect, more like a condition where the
    // Location need to be other than the currect input location (for example: uni.getLocation2(shop))
    // while other.Location is more like a command
    public double distance(Location2 other)
    {
        return Math.sqrt((this.xcoord - other.getXcoord()) * (this.xcoord - other.getXcoord())
                + (this.ycoord - other.getYcoord()) * (this.ycoord - other.getYcoord()));
    }
}

/// This file is similar to Python's Function files, where we create our own functions, so that it can be used in other programs