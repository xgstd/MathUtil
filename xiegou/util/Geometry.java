package xiegou.util;

public class Geometry {
  public static double getTriangleArea(double a, double h) {
    return ((a * h) / 2);
  }

  public static double getTrapeziumArea(double a, double b, double h) {
    return (((a + b) * h) / 2);
  }

  public static double getCircleArea(double r) {
    return (Math.PI * Math.pow(r, 2));
  }
}
