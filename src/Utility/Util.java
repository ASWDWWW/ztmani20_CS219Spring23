package Utility;

public class Util {
    /**
     *
     * @param c inital investment
     * @param r yearly investment rate
     * @param t time in years
     * @param n number of times to compound per year
     * @return value of the investment
     */
    public static double investment(double c, double r, double t, int n) {
        return c * Math.pow(1+r/n, t*n);

    }

    public static double f2c(double f) {
        return 5/9.0 * (f - 32);
    }

    /**
     *
     * @param t temp in F
     * @param v wind velocity in mpd
     * @return windchill in F
     */
    public static double windchill(double t, double v) {
        double w = 35.74 + (0.6215*t) + (0.4275*t-35.75) * Math.pow(v,0.16);
        return w;

    }
}
