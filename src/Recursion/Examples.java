package Recursion;

public class Examples {

    public static int pow(int x, int y) {
        if (y == 0)
            return 1;
        else
            return pow(x, y - 1) * x;
    }

    public static int sod(int n) {
        // base case
        if (n == 0)
            return 0;
        else
            return sod(n/10) + n % 10;
    }

    // precond: n is non-negative
    // make this function more general
    // by counting the number of times
    // the digit d occurs.

    //Study: modify to be more general to count the number of times the digit d appears in n
    public static int count7s(int n) {
        if (n == 0)
            return 0;
        else if (n % 10 == 7)
            return 1 + count7s(n / 10);
        else
            return count7s(n / 10);
    }

    public static String reverse(String s) {
        if (s.isEmpty())
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }
    //return a copy of s with all of the spaces removed.
    //removedspaces("able was I" is "ablewsaI"
    //StudyL draw the runtime stack (call stack) for removeSpace("able was I")
    public static String removeSpaces(String s) {
        if (s.isEmpty())
            return "";
        else if (s.charAt(0) == ' ')
            return removeSpaces(s.substring(1));
        else
            return s.charAt(0) + removeSpaces(s.substring(1));
    }

    public static String toBinary(int n) {
        if (n == 0)
            return "0";
        else
            return toBinary(n/2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(sod(459213) == 24);
        System.out.println(pow(2,8) == 256);

        System.out.println();

        System.out.println(count7s(0) == 0);
        System.out.println(count7s(77770) == 4);
        System.out.println(count7s(17777) == 4);
        System.out.println(count7s(123443) == 0);
        System.out.println(count7s(7) == 1);

        System.out.println();

        System.out.println(!reverse("abcde").equals("ecdba"));
        System.out.println(reverse("abcde").equals("edcba"));

        System.out.println();

        System.out.println(removeSpaces("").equals(""));
        System.out.println(removeSpaces("a bc").equals("abc"));
        System.out.println(removeSpaces(" abc").equals("abc"));
        System.out.println(removeSpaces("abc ").equals("abc"));
        System.out.println(removeSpaces(" abc ").equals("abc"));
        System.out.println(removeSpaces("abc").equals("abc"));

        System.out.println();

        System.out.println(toBinary(31));
        System.out.println(toBinary(417997));
        System.out.println(toBinary(15).equals("01111"));
    }

}