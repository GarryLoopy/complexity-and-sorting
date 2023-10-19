package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class OctagonalPrism extends Prism{
    
    public OctagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    public double calculateBaseArea()
    {
        return 2.0 * (1 + Math.sqrt(2)) * Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume()
    {
        return calculateBaseArea() * getHeight() / 4.0;
    }
}
