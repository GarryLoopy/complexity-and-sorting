package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class TriangularPrism extends Prism{
    
    public TriangularPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea((Math.sqrt(3) / 4) * Math.pow(getEdge(), 2));
    }
    @Override
    protected void calculateVolume()
    {
        setVolume(getBaseArea() * getHeight());
    }
}
