package complexityandsorting.Shapes;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */

public abstract class Shape {
    public abstract double getBaseArea();

    public abstract double getVolume();

    public abstract double getHeight();

    public int compareTo(Shape shape) {
        return 0;
    }
}