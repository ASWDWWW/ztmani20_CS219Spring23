package LoopExercises;


public class MoreLoopExercises {
    /**
     *
     * @param ch a random letter of the alphabet lower or upper case
     * @return Boolean value
     */
    public static boolean isVowel(char ch) {
        //find if the ch is in the index of the provide string of vowels
        return "aeiouyAEIOUY".indexOf(ch) > -1;
        //return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }



    /*
     * You are given two strings - pattern and source.
     * The first string pattern contains only the symbols
     * 0 and 1, and the second string source contains
     * only lowercase English letters. Let's say that
     * pattern matches a substring of source if the
     * following three conditions are met:
     *
     *   1) they have equal length
     *
     *   2) for each 0 in pattern the corresponding
     *      letter in the substring is a vowel
     *
     *   3) for each 1 in pattern the corresponding
     *      letter is a consonant.
     *
     * Your task is to calculate the number of substrings of
     * source that match pattern.
     *
     * Example
     *
     * For pattern = "010" and source = "amazing", the function should
     * return 2.
     *
     * "010" matches "ama", because both 0s match a,
     *       which is a vowel, and 1 match m, which is a consonant;
     *
     * "010" doesn't "maz", because the first 0 corresponds to an m,
     *       which is a consonant, not a vowel;
     *
     * "010" matches "azi", because the first 0 matches an a (vowel),
     * 1 matches z (consonant), and the second 0 matches i (vowel);
     *
     * "010" doesn't match "zin", because the first 0 corresponds
     * to a consonant (z);
     *
     * "010" doesn't match "ing", because the second 0 corresponds
     * to the letter g, which is a consonant.
     *
     * So, there are only 2 matches.
     *
     * For pattern = "110" and source = "programming", the function
     * should return 3.
     */
    public static int match(String patt, String src) {
        int count = 0;
        // for each char in the source string
        for (int i = 0; i <= src.length() - patt.length(); i++) {
            int j = 0;
            boolean flag = true;
            // go through patt until the end or ot fail
            while (j < patt.length() && flag) {
                char patt_ch = patt.charAt(j);
                char src_ch = src.charAt(i + j);
                if (isVowel(src_ch) && patt_ch == '0' || !isVowel(src_ch) && patt_ch == '1') {
                    j++;
                } else {
                    flag = false;
                }
            } // end of while
            if (flag) count++;
        } // end of for loop
        return count;
    } // end of function match

    /*
     * count7s  returns the number of times the digit 7 appears in
     * the parameter n.
     *
     * count7s(1727337) = 3
     * count7s(1234) = 0
     * count7s(777777) = 6
     *
     * Question: Does the function work if n is negative?
     */
    // we are returning an integer
    public static int count7s(int n) {
        //count to keep the count
        int count = 0;
        //make it abs to accept negatives
        n = Math.abs(n);
        //while function if we can mod by 10
        // mod to get the last number
        // divide by 10 to remove the number
        while (n >= 10) {
            if (n % 10 == 7) {
                count++;
                n = n / 10;
            }
            // return the number
            else {
                n = n / 10;
            }
        } //end of for loop
        if (n == 7) {
            count++;
        }
        //return the count of how many 7s
        return count;
    }// end of function match


    /*
     *  If we list all the natural numbers below 10 that are multiples
     *  of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     *  Find the sum of all the multiples of 3 or 5 below 1000.
     *
     *  https://projecteuler.net/problem=1
     *
     *  n should be non-negative
     *  sum3or5(10) = 23
     *  sum3or5(1000) = 233168
     */
    //returning a integer value
    public static int sum3or5(int n) {
        // keeping a count for the overall sum
        int count = 0;
        // initialize to variables for 3 and 5
        int h = 3;
        int m = 5;
        // while function so we do go over the n for the factors
        while (h < n || m < n) {
            // if h factor is less than m factor
            while (h < m) {
                //System.out.println(h);
                //add factor to the count
                count = count + h;
                //System.out.println(count);
                // increment h by 3 for the next factor
                h = h + 3;
                //System.out.println(h);
                //System.out.println(m);
                //System.out.println();
                //check if the m and n equals the input number
                if (m >= n && h >= n) {
                    // if so then good and return the sum
                    return count;
                }

            }
            // if h factor is greater than m factor
            while (m < h) {
                //System.out.println(m);
                // add factor to count
                count = count + m;
                //System.out.println(count);
                //increment m by 5
                m = m + 5;
                //System.out.println(m);
                //System.out.println(h);
                //System.out.println();
                //check if the m and n equals the input number
                if (m >= n && h >= n){
                    // if so then good and return the sum
                    return count;
                }
            }
            // check if m and h are equal so we dont double count
            while (m == h) {
                count = count + h;
                // increment both m and h
                m = m + 5;
                h = h + 3;
                //check if the m and n equals the input number
                if (m >= n && h >= n){
                    // if so then good and return the sum
                    return count;
                }

            }
        }
        //return the sum
        return count;
    }



    /*
     * Return the first factor of n greater than 1
     * and less than n. If no factors return -1.
     * Notice that this function uses longs and not ints.
     *
     *  factor(25) =
     *  factor(59953793) == 7727
     *  factor(1531482031) == -1
     *  factor(7304692485435694493L) == -1;
     *
     * Question: Notice the letter L on the end of the largest integer above?
     *           Any guess of what it means or why it is there?  What happens if you
     *           remove it?
     */
    // returning a long value
    public static long factor(long n) {
        // initilize i  to 2 because first factor great than 1
        int i = 2;
        // while function to check all the factors up to the number
        while (i <= n) {
            // use mod operation to check if a factor
            if (n % i == 0) {
                // return the factor
                return i;
            }
            if (n % i != 0) {
                //increment i by 1
                i++;
            }
            else {
                // no factor return -1
                return -1;
            }
        }
        // no factor return -1
        return -1;
    }

    /*
     * Write a function stars(n) that will print n asterisks
     * on the console window.
     *
     * stars(5) will print *****
     *
     * Question: Why is this a void function?
     */
    public static char stars(int n) {
        // loop through n times
        for (int i = 1; i <= n; i++){
            //print a *
            System.out.print("*");
        }
        //if n = 0 return nothing
        return ' ';
    }

    /*
     * Write a function triangle that takes an integer n and will print
     * a right triangle of n rows where the first row has 1 asterisk
     * and the nth row has n asterisks, For example,
     *
     * triangle(5) will print
     *
     *         *
     *         **
     *         ***
     *         ****
     *         *****
     *
     *  Hint: use the function stars you defined above.
     */
    // void becasue we print in the class
    public static void triangle(int n) {
        // loop through n times
        for (int i = 1; i <= n; i++){
            //loop through i times
            for (int j = 1; j <= i; j++){
                //if equal to each other
                if (j == i) {
                    // print new line
                    System.out.println("*");
                }
                else {
                    //print i stars
                    System.out.print("*");
                }
            }
        }
    }

    /*
     *  Fizz Buzz
     *
     *  Write a function fizzbuzz that takes an integer n and
     *  prints out the integers from 1 to n. If the number is
     *  divisible by 3 print "fizz" instead of the number. If
     *  the number is divisible by 5 then print "buzz" instead
     *  of the number. And if it is divisible by 3 and 5 it prints "fizz buzz".
     *
     *  For example, calling fizzbuzz(16) would print
     *  1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizz buzz 16
     *
     *  Instead of commas you can print each entry on its own line.
     *
     *  https://en.wikipedia.org/wiki/Fizz_buzz
     *
     */
    // void becasue we print in the class
    public static void fizzbuzz(int n) {
        //loop through n times
        for (int i = 1; i <= n; i++){
            //check if a multiple of 3 and 5
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
            }
            //check if a multiple of 3 or 5
            else if (i % 3 == 0){
                // if multiple 3 print fizz
                System.out.println("fizz");
            }
            else if (i % 5 == 0){
                //if multiple of 5 print buzz
                System.out.println("buzz");
            }

            else {
                // if nothing then print the number
                System.out.println(i);
            }
        }
    }

    /*
     * A palindrome number is an integer n that, when you reverse the digits,
     * gives you n back. For example 121, 11, 2, 1221, 12321, 123321 are
     * all palindrome numbers.  The integer 1234 is not a palindrome integer.
     *
     * Write a boolean function isPalindrome that returns true of the integer
     * n passed to it is a palindrome integer, otherwise it returns false.
     *
     */
    // we are returning a boolean value
    public static boolean isPalindrome(int n) {
        // initialize j for new number  and x to manipulate n
        int j = 0;
        int x = n;
        //check there is no more numbers in n
        while (n != 0){
            //take the last number and add the digit to the first place of the j integer
            j = j * 10 + ( n % 10);
            // take the last number off n
            n = n / 10;

        }
        // if the j is equal to the original number than true
        return j == x;
    }

    /*
     * This function is similar to the triangle function; but a little trickier.
     *
     * Write a function named staircase that takes an integer n, and produces the triangle
     * pattern below. For example calling staircase(5) would print
     *
     *        *
     *       **
     *      ***
     *     ****
     *    *****
     *
     * In general, there are n rows of asterisks where the last row has n asterisks.
     */
    public static int staircase(int n) {
        String y = "";
        int i = n - 1;
        int count = 1;
        int j = n;
        while (j > 0) {
            while (count <= i) {
                y = y + " ";
                count++;
            }
            while (count <= n && count > i) {
                y = y + "*";
                if (y.length() == n) {
                    System.out.println(y);
                    j = j - 1;
                    i = i - 1;
                    y = "";
                    count = 1;
                }
                else {
                    count++;
                }
            }
        }// fill in code here
        return 1;
    }

    /*
     *   perfect number
     *
     *   A perfect number is a number that is equal to the sum of its divisors that
     *   are less than the number. For example, 6 is a perfect number
     *   because 6 = 1 + 2 + 3 and 1,2,3 are the divisors.
     *
     *   28 is also a perfect number because 28 = 1 + 2 + 4 + 7 + 14 and 1,2,4,7,14 are the only
     *   divisors of 28.
     *
     *   Write a function named perfect that takes an integer n and returns true if n
     *   is a perfect number, and false if it is not.
     *
     *   perfect(28) == true
     *   perfect(496) == true
     *   perfect(99) == false
     */
    public static boolean perfect(int n) {
        return false;   // shut up error message
    }

    /*
     *   Find perfect numbers
     *
     *   Write a function findPerfect that searches for more perfect numbers.
     *   Check numbers all the way up to 2147483647
     *
     *   Question: What is special about the number 2147483647?
     */
    public static void findPerfect() {
        // fill in code here
    }

    /*
     * Thoroughly test all of your functions above.
     */
    public static void main(String[] args) {
        System.out.println(match("010", "amazing") == 2);
        System.out.println(match("011", "amazing") == 1);
        System.out.println("                                    ");
        System.out.println(count7s(7) == 1);
        System.out.println(count7s(713534) == 1);
        System.out.println(count7s(122343537) == 1);
        System.out.println(count7s(12237353) == 1);
        System.out.println(count7s(77777) == 5);
        System.out.println(count7s(123456) == 0);
        System.out.println(!(count7s(2) == 1));
        System.out.println(!(count7s(-7) == 1));
        System.out.println("                                    ");
        System.out.println(sum3or5(10));
        System.out.println(sum3or5(1000));
        System.out.println();
        System.out.println(factor(25) == 5);
        System.out.println(factor(59953793) == 7727);
        System.out.println(factor(1531482031) == -1);
        System.out.println(factor(7304692485435694493L) == -1);
        System.out.println();
        System.out.println(stars(5));
        triangle(5);
        fizzbuzz(16);
        System.out.println(isPalindrome(1221));
        //System.out.println(staircase(5));
        System.out.println();

    }
}