package CS250;
import java.util.*;

public class FlippingACoin {
    public static void main(String[] args) {
        System.out.print(coinFlip(4, "H"));
    }

    public static String coinFlip(int x, String s) {
        int i = 0;
        int j = 0;
        int y = 2;
        Random rand = new Random();
        List<String> list = new ArrayList<>();

        if (x < 0) {
            return "ERROR";
        }
        else {

            while (x > 0) {
                int intrand = rand.nextInt(y);
                if (intrand == 0) {
                    list.add("T");
                    i += 1;
                    j = 0;
                    if (Objects.equals(s, "T") && i == x) {
                        x = 0;
                        return list.toString();
                    }
                }
                if (intrand == 1) {
                    list.add("H");
                    j += 1;
                    i = 0;
                    if (Objects.equals(s, "H") && j == x) {
                        x = 0;
                        return list.toString();
                    }
                }
            }
        }
        return list.toString();
    }
}
