package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public class Cone extends Circle{

    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double calculateVolume()
    {
        return (1 / 3) * Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

}
