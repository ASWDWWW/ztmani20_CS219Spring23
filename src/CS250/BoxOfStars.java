package CS250;

public class BoxOfStars {
    public static void main(String[] args) {
        boxOfStars(5, 3);
    }

    public static void boxOfStars(int w, int h) {
        // initialize i and j values for loops
        int i;
        int j = 1;
        // while loop to account for the h
        while (j != h + 1) {
            // if statement to account for the first and last row
            if (j == 1 || j == h) {
                for (i = 2; i <= w; i++) {
                    System.out.print("*");
                    if (i == w) {
                        System.out.println("*");
                        // increment j
                        j++;
                    }

                }
            }
            // else statement for the rows that are not filled in all the way
            else {
                for (i = 2; i <= w; i++) {
                    if (i == 2) {
                        System.out.print("*");
                    }
                    if (i == w) {
                        System.out.println("*");
                        // increment j
                        j++;
                    } else {
                        System.out.print(" ");
                    }
                } // for
            } //else


        } //while loop
    } // method closure
}
