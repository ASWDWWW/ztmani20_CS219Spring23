package CS250;

public class factorials {
    public static void main(String[] args) {
        System.out.print(factorial(10));
    }
    public static int factorial(int x) {
        int fact = 1;
        for (int i=x;i >= 1;) {
            fact = fact * i;
            i = i - 1;
        }
        return fact;
    }
}
