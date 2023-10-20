package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Cone extends Circle {

    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double calculateBaseArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateVolume() {
        return (1 / 3.0) * Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

}
