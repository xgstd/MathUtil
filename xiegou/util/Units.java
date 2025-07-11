package xiegou.util;

public class Units {
  public static double kmhToMs(double kmh) {
    return kmh / 3.6;
  }

  public static double toDegreeFahrenheit(double degreeCelsius) {
    return (degreeCelsius * 1.8) + 32;
  }
}
