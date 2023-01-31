package HW2;

public class DayOfWeek {
    public static Integer dayofweek(int month, int day, int years) {
        int y0 =  years - (14 - month)/12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12* ((14 - month) / 12) - 2;

        int d0 = (day + x + 31*m0 / 12) % 7;
        return d0;

    }

    public static void main(String[] args) {
        System.out.print(dayofweek(2, 10, 2020));
    }
}
