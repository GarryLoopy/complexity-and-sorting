package complexityandsorting.Shapes;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */

public class Pyramid extends Shape {
  private double height;
  private double sideLength;

  public Pyramid(double height, double sideLength) {
    this.height = height;
    this.sideLength = sideLength;
  }

  @Override
  public double getBaseArea() {
    return Math.pow(sideLength, 2);
  }

  @Override
  public double getVolume() {
    return 1 / 3 * (Math.pow(sideLength, 2)) * height;
  }

  @Override
  public double getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return "Type: " + this.getClass().getSimpleName() + "\nBase Area: " + getBaseArea() + "\nVolume: " + getVolume()
        + "\nHeight: " + height;
  }
}
