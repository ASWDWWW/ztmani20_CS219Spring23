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

    public static int indexOf(int [] values, int key) {
        for (int i = 0; i < values.length; i++){
            if (values[i] == key){
                return i;
            }
        }
        return -1;
    }
    // shift all of the values in the array left by one place,starting at index i and filling in the last value as 0
    public static int[] shift(int [] a, int i) {
        for (int j = i; j < a.length-1; j++){
            a[j] = a[j+1];
        }
        a[a.length-1] = 0;
        return a;
    }

    public static int[] banish(int [] a, int [] b) {
        for (int i = 0; i < b.length - 1; i++) {
            if (indexOf(a, b[i]) != -1) {

                shift(a, indexOf(a, b[i]));
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] array = {4,7,6,9,1,7};
        int [] array2 = {6};
        System.out.println(indexOf(array, 9) == 3);
        System.out.println(indexOf(array, 43) == -1);
        System.out.println(indexOf(array, 7) == 1);

        shift(array, 2);
        System.out.println(Arrays.toString(array).equals(Arrays.toString(new int [] {4,7,9,1,7,0})));
        System.out.println(Arrays.compare(array, new int [] {4,7,9,1,7,0}) == 0);

        System.out.println(Arrays.toString(banish(array, array2)));
    }

} //class MyArrays
