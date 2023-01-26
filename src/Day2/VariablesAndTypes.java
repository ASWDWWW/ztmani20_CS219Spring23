package Day2;

import Utility.Util;
public class VariablesAndTypes {

    // keep code neat with comments for each parameters and return

    //main is the name of a function
    //void is the return type
    public static void main(String[] args) {
        // print out for f2c function
        System.out.println(Util.f2c(212));
        // print out for investment function
        // cast r value to an int
        System.out.println(Util.investment(1, 1.0, 1, (int) 1e9));
        //grey means the variable is not being used
        int x = 7;
        System.out.println(x*x);
        x = 8;

        //a float need a F at the end of the number
        float e = 2.7182F; // dont use floats
        double pi = 3.14159; // double precision

        // double electron_mass = 0.000000000000000000000000000000091093837105;
        // final makes variable definite
        final double electron_mass = 9.109e-31;
        // electron_mass = 78; error

        //Avagadro's #
        final double Avagadros_number = 6.0221408e23;

        System.out.println(Util.windchill(32,10));
    }

}
