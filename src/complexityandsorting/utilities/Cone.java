package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Cone extends Circle{

    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    protected void calculateVolume()
    {
        setVolume((1 / 3.0) * Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }

}
