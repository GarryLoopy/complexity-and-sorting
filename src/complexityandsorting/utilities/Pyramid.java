package complexityandsorting.utilities;

/**
 * Represents a pyramid
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public final class Pyramid extends Shape{
    private double edge;
    
    /**
     * The constructor for the pyramid
     * @param height the height of the pyramid
     * @param edge the edge of the pyramid
     */
    public Pyramid(double height, double edge)
    {
        super(height);
        this.edge = edge;

        calculateBaseArea();
        calculateVolume();
    }
    
    /**
     * Getter for edge
     * @return the edge of the pyramid
     */
    public double getEdge() 
    {
        return this.edge;
    }

    /**
     * Setter for edge
     * @param edge the new edge for the pyramid
     */
    public void setEdge(double edge)
    {
        this.edge = edge;
    }
    
    /**
     * Calculates base area
     */
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea(Math.pow(getEdge(), 2));
    }

    /**
     * Calculates volume
     */
    @Override
    protected void calculateVolume() 
    {
        setVolume((1 / 3) * Math.pow(getEdge(), 2) * getHeight());
    }

    /**
     * ToString method for the pyramid
     * @return a string representation of the pyramid
     */
    @Override
    public String toString() {
        return "Pyramid\n" + super.toString() + "\nEdge: " + getEdge() + "\nVolume: " + getVolume() + "\nArea: " + getBaseArea() + "\n";
    }
}
