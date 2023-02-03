package CS250;

public class Util {
    /***
     *
     * @param a first integer
     * @param b second integer
     * @param c thrid integer
     * @return the average of the 3 numbers
     */
    public static int averageOf3(int a, int b, int c) {
        //add all three integers
        int add = a + b + c;
        //divide the addition of the three integers
        int divide = add / 3;
        //return the value of dive
        return divide;

    }

    /**
     *
     * @param x random integer
     * @return the factorial of the integer
     */
    public static int factorial(int x) {
        //set fact as the identity to storage multiplication
        int fact = 1;
        //for statement setting i to x where i is greater than of equal to 1
        for (int i=x;i >= 1;) {
            //multiple each iterated i by the new integer when multiplied
            fact = fact * i;
            //increment the i so by 1 until it reaches 1
            i = i - 1;
        }
        //return the product
        return fact;
    }

    /**
     *
     * @param a non-neg int
     * @param b non-neg int
     * @return boolean value true if multiple false if non multiple
     */
    //return value is boolean
    public static Boolean isMultiple(int a, int b) {
        //modular arithmetic if mod then true
        if (a % b == 0) {
            return true;
        }
        //if not mod then false
        else {
            return false;
        }

    }
}
