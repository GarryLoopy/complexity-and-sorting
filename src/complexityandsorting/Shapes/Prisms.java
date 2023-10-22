package complexityandsorting.Shapes;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */

public class Prisms extends Shape {
  private double sideLength;
  private double height;

  public Prisms(double sideLength, double height) {
    this.sideLength = sideLength;
    this.height = height;
  }

  public class SquarePrism extends Prisms {
    public SquarePrism(double sideLength, double height) {
      super(sideLength, height);
    }

    @Override
    public double getBaseArea() {
      return Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
      return getBaseArea() * height;
    }

    @Override
    public double getHeight() {
      return height;
    }
  }

  public class TriangularPrism extends Prisms {
    public TriangularPrism(double sideLength, double height) {
      super(sideLength, height);
    }

    @Override
    public double getBaseArea() {
      return Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
      return getBaseArea() * height;
    }

    @Override
    public double getHeight() {
      return height;
    }
  }

  public class PentagonPrisms extends Prisms {
    public PentagonPrisms(double sideLength, double height) {
      super(sideLength, height);
    }

  }

  public class OctagonPrisms extends Prisms {
    public OctagonPrisms(double sideLength, double height) {
      super(sideLength, height);
    }

    @Override
    public double getBaseArea() {
      return Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
      return getBaseArea() * height;
    }

    @Override
    public double getHeight() {
      return height;
    }
  }

  @Override
  public double getBaseArea() {
    return Math.pow(sideLength, 2);
  }

  @Override
  public double getVolume() {
    return getBaseArea() * height;
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
