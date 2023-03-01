package CS250;

import java.util.Scanner;

public class ComputeSumOfDigits {
    public static void main(String[] args) {
        // initialize scanner for input in the console
        Scanner kbd = new Scanner(System.in);
        System.out.print("Type an integer: ");
        // take only integers entered
        int d = kbd.nextInt();
        // call the sum of digits function with the inputted int
        int z = computeSumOfDigits(d);
        System.out.println("Digit sum is " + z);

    }

    public static int computeSumOfDigits(int x) {
        // initialize i to manipulate the number entered
        int i = x;
        // initialize f to get the last digit and add to count
        int f;
        // count to keep track of addition
        int count = 0;
        // while function till i = 0 when dividing by 10
        while (i != 0){
            // last digit of the int
            f = i % 10;
            // add last digit to running count
            count = count + f;
            // remove the last digit of the int
            i = i / 10;
        }
        // return the count once i = 0
        return count;
    }
}
