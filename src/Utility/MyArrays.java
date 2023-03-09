package Utility;

import java.util.Arrays;

public class MyArrays {

    public static double max(double [] values) {
        double largest = values[0];
        largest = Double.NEGATIVE_INFINITY;
        for (double v : values){
            if (v > largest){
                largest = v;
            }
        }
        return largest;

    }

    public static double min(double [] values) {
        double smallest = values[0];
        smallest = Double.POSITIVE_INFINITY;
        for (double v : values){
            if (v < smallest){
                smallest = v;
            }
        }
        return smallest;

    }

    public static double median(double [] values) {
        double [] tmp = Arrays.copyOf(values, values.length);
        Arrays.sort(tmp);

        if (tmp.length % 2 == 1){
            return tmp[tmp.length / 2];
        }
        else {
            return (tmp[tmp.length / 2] + tmp[(tmp.length / 2) -1]) / 2.0;
        }

    }
    public static void printDoubles(double [] values) {
        System.out.print('[');
        for (int i = 0; i < values.length -1; i++) {
            System.out.print(values[i] + ", ");
        }
        System.out.print(values[values.length-1]);
        System.out.println(']');

    } // printDoubles

    public static double mean(double [] values) {
        double count = 0;
        for (double value : values) {
            count = value + count;
        }
        return count / values.length;
    }

} //class MyArrays
