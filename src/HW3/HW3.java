package HW3;

// These problems are taken from Nick Parlante's codingbat.com/java.

import java.util.Optional;

public class HW3 {

    /**
     *   codingbat.com/java
     *   When squirrels get together for a party, they like to have cigars.
     *   A squirrel party is successful when the number of cigars is between
     *   40 and 60, inclusive. Unless it is the weekend, in which case there
     *   is no upper bound on the number of cigars. Return true if the
     *   party with the given values is successful, or false otherwise.
     *
     *       cigarParty(30, false) → false
     *       cigarParty(50, false) → true
     *       cigarParty(70, true) → true
     */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (40 <= cigars && cigars <= 60) ||
                (isWeekend && cigars >= 40); // fill in function body
    }

    /**
     *  You are driving a little too fast, and a police officer stops you.
     *  Fill in function below to compute the result, encoded as an int
     *  value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is
     *  60 or less, the result is 0. If speed is between 61 and 80 inclusive,
     *  the result is 1. If speed is 81 or more, the result is 2.
     *  Unless it is your birthday -- on that day, your speed can be
     *  5 higher in all cases.
     *
     *  caughtSpeeding(60, false) → 0
     *  caughtSpeeding(65, false) → 1
     *  caughtSpeeding(65, true) → 0
     */

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int adjust = 0;

        if (isBirthday)
            adjust = 5;

        if (speed <= 60 + adjust)
            return 0;
        else if (speed <= 80 + adjust)
            return 1;
        else
            return 2;
    }

    /**
     * Return true if d1, d2, d3 are in either ascending or descending order.
     * Otherwise return false
     */
    public static boolean ordered(int d1, int d2, int d3) {
        if (d1 > d2){
            return false;
        }
        if (d1 > d3){
            return false;
        }
        return d2 <= d3;
    }

    /**
     * The number 6 is a truly great number. Given two int values,
     * a and b, return true if either one is 6. Or if their sum or
     * difference is 6. Note: the function Math.abs(num) computes the
     * absolute value of a number.
     */
    public static boolean love6(int a, int b) {
        if (a == 6){
            return true;
        }
        if (b == 6){
            return true;
        }
        if (a + b == 6){
            return true;
        }
        if (Math.abs(b-a) == 6){
            return true;
        }
        return a - b == 6;
    }

    /**
     * You have a lottery ticket with integers a, b, and c, each of which is
     * 0, 1, or 2. If they are all 2, your winnings are $10. Otherwise, if
     * they are all the same, your winnings are $5. Otherwise, so long as both
     * b and c are different from a, the result is $1. Otherwise the result is $0.
     *
     * redTicket(2, 2, 2) → 10
     * redTicket(2, 2, 1) → 0
     * redTicket(0, 0, 0) → 5
     */
    public static int redTicket(int a, int b, int c) {
        if (!(0 <= a && a <= 2 && 0 <= b && b <= 2 && 0 <= c && c <= 2)){
            return 0;
        }
        if (a == 2 && b == 2 && c == 2){
            return 10;
        }
        else if (a == b && b ==c ){
            return 5;
        }
        else if (b == c){
            return 1;
        }
        else {
            return 0;
        }
    }

    /**
     * You have a blue lottery ticket, with ints a, b, and c on it.
     * This makes three pairs, which we'll call ab, bc, and ac. Consider the
     * sum of the numbers in each pair. If any pair sums to exactly 10,
     * the result is 10. Otherwise, if the ab sum is exactly 10 more than either
     * bc or ac sums, the result is 5. Otherwise, the result is 0.
     *
     *  blueTicket(9, 1, 0) → 10
     *  blueTicket(9, 2, 0) → 0
     *  blueTicket(6, 1, 4) → 10
     */
    public static int blueTicket(int a, int b, int c) {
        int x = a + b;
        int y = c + b;
        int z = a + c;
        int q = x - y;
        int w = x - z;
        if (x == 10) {
            return 10;
        }
        if (y == 10){
            return 10;
        }
        if (z == 10) {
            return 10;
        }
        if (q == 10){
            return 5;
        }
        if (w == 10) {
            return 5;
        }
        else {
            return 0;
        }
    }

    /**
     * Given two ints, each in the range 10..99, return true if there is a
     * digit that appears in both numbers, such as the 2 in 12 and 23.
     * Reminder: n/10, gives the left digit while the % "mod" n%10 gives
     * the right digit.
     *
     *
     *  shareDigit(12, 23) → true
     *  shareDigit(12, 43) → false
     *  shareDigit(12, 44) → false
     */
    public static boolean shareDigit(int x, int y) {
        int q = x / 10;
        int qx = x % 10;
        int w = y / 10;
        int wy = y % 10;
        if (!(10 <= x && x <= 99 && 10 <= y && y <= 99)){
            return false;
        }
        if (q == w || q == wy){
            return true;
        }
        else return qx == w || qx == wy;
    }

    public static void main(String[] args) {
        // write some tests for your functions
        System.out.println(!cigarParty(30,false));
        // finish cigar party tests

        System.out.println(caughtSpeeding(60, false) == 0);
        // finish caughtSpeeding tests

        // write ordered tests
        System.out.println("       ordered                 ");
        System.out.println(ordered(1,2,3));
        System.out.println(!ordered(3, 2, 1));
        System.out.println(!ordered(9,1,8));
        System.out.println(ordered(1,1,8));
        System.out.println(ordered(4,4,4));
        System.out.println(ordered(4,8,8));
        System.out.println(!ordered(9,9,1));

        // love6 tests
        System.out.println("       love6                 ");
        System.out.println(love6(3,3));
        System.out.println(love6(6,0));
        System.out.println(love6(0,6));
        System.out.println(love6(-3,9));
        System.out.println(love6(9,-3));
        System.out.println(love6(7,1));
        System.out.println(love6(-1,-7));
        System.out.println(love6(-3,-9));
        System.out.println(!love6(5,5));
        System.out.println(love6(2,8));
        System.out.println(!love6(5,5));
        System.out.println(!love6(-7,9));
        System.out.println(!love6(3,-9));

        //redTicket
        System.out.println("       redTicket                 ");
        System.out.println(redTicket(2,2,2) == 10);
        System.out.println(redTicket(0,0,0) == 5);
        System.out.println(redTicket(1,1,1) == 5);
        System.out.println(redTicket(2,1,1) == 1);
        System.out.println(redTicket(1,1,2) == 0);
        System.out.println(redTicket(1,2,1) == 0);
        System.out.println(redTicket(0,1,2) == 0);
        System.out.println(redTicket(-1,-2,-2) == 0);
        System.out.println(redTicket(4,5,6) == 0);

        //blueTicket
        System.out.println("        blueTicket              ");
        System.out.println(blueTicket(6, 4,1) == 10);
        System.out.println(blueTicket(1, 6,4) == 10);
        System.out.println(blueTicket(4, 1,6) == 10);
        System.out.println(blueTicket(13, 11,3) == 5);
        System.out.println(blueTicket(16, 14,6) == 5);
        System.out.println(blueTicket(4,12,7) == 0);
        System.out.println(blueTicket(-2,5,-7) == 0);
        System.out.println(blueTicket(13,-5,4) == 0);

        //shareDigits
        System.out.println("   shareDigits                     ");
        System.out.println(shareDigit(32,12));
        System.out.println(shareDigit(12,32));
        System.out.println(shareDigit(23,12));
        System.out.println(shareDigit(23,21));
        System.out.println(!shareDigit(23,2));
        System.out.println(!shareDigit(2,23));
        System.out.println(!shareDigit(102,2));
        System.out.println(!shareDigit(100,200));
        System.out.println(!shareDigit(9,2));


    }

}  // class LogicExercises