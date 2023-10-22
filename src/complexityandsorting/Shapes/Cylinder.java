package complexityandsorting.Shapes;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */

public class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getVolume() {
        return Math.PI * (Math.pow(radius, 2)) * height;
    }

    @Override
    public double getHeight() {
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Type: " + this.getClass().getSimpleName() + "\nBase Area: " + getBaseArea() + "\nVolume: " + getVolume()
                + "\nHeight: " + height;
    }
}
