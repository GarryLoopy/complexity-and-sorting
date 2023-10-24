package complexityandsorting.utilities;

/**
 * Represents an octagonal prism
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class OctagonalPrism extends Prism{
    
    /**
     * Constructor for the prism
     * @param height the height of the octagonal prism
     * @param edge the edge of the octagonal prism
     */
    public OctagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    /**
     * Calculates base area for the octagonal prism
     */
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea(2.0 * (1 + Math.sqrt(2)) * Math.pow(getEdge(), 2));
    }

    /**
     * Calculates the volume for the octagonal prism
     */
    @Override
    protected void calculateVolume()
    {
        setVolume(getBaseArea() * getHeight() / 4.0);
    }

    /**
     * The ToString method for the prism
     * @return a string representation of the prism
     */
    @Override
    public String toString() {
        return "Octagonal Prism\n" + super.toString();
    }
}
