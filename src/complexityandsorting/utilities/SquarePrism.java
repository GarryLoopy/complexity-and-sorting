package complexityandsorting.utilities;

/**
 * Represents a square prism
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class SquarePrism extends Prism{
    
    /**
     * Constructor for the prism
     * @param height the height for the prism
     * @param edge the edge for the prism
     */
    public SquarePrism(double height, double edge)
    {
        super(height, edge);
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
        setVolume(Math.pow(getEdge(), 2) * getHeight());
    }
    
    /**
     * The ToString method for the prism
     * @return a string representation of the prism
     */
    @Override
    public String toString() {
        return "Square Prism\n" + super.toString();
    }
}
