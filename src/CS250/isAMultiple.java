package CS250;

public class isAMultiple {
    public static void main(String[] args) {
        System.out.print(isMultiple(17,5));
    }
    public static Boolean isMultiple(int a, int b) {
        if (a % b == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}
