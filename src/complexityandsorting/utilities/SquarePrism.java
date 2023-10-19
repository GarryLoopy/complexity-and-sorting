package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class SquarePrism extends Prism{
    
    public SquarePrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    public double calculateBaseArea()
    {
        return Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume()
    {
        return Math.pow(getEdge(), 2) * getHeight();
    }
}
