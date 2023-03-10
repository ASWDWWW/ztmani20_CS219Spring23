package SwallowSpeeds;

import Utility.MyArrays;
import Utility.Util;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     *
     * @param s - properly constructed scanner and in particular not null
     */
    public static void show(Scanner s) {
        while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }

    }

    //loadspeeds returns the array that was constructed from the file of doubles
    public static double [] loadSpeeds(Scanner s) {
        // define an array of doubles
        double [] speeds = new double[18];
        int i = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.indexOf('#') == -1 && !line.isBlank()){
                speeds[i] = Double.parseDouble(line);
                i++;
            }
        }
        return speeds;
    }





    public static void main(String[] args) {
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        Scanner s = Util.openSite(path);
        if (s != null) {
//            show(s);
            double [] vec = loadSpeeds(s);
            System.out.println(Arrays.toString(vec));
            MyArrays.printDoubles(vec);


            System.out.println(MyArrays.mean(vec));
            System.out.println(MyArrays.mean(/* array literal syntax*/new double[] {1.0,2.0,3.0,4.0}) == 2.5);


            System.out.println(MyArrays.max(vec));
            System.out.println(MyArrays.min(vec));
            System.out.println(MyArrays.max(new double[] {1.0,2.0,3.0,4.0}) == 4.0);
            System.out.println(MyArrays.min(new double[] {1.0,2.0,3.0,4.0}) == 1.0);

            System.out.println(MyArrays.median(vec));
            MyArrays.printDoubles(vec);
            System.out.println(MyArrays.median(new double[] {1.0,2.0,3.0,4.0}));


        }

    }
} // end of class main
