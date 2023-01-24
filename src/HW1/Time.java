package HW1;

public class Time {
    public static void main(String[] args) {
        System.out.println("HW1");
        //Q2
        int hour = 15;
        int minute = 23;
        int second = 20;
        int from_midnight = (hour * 60 * 60) + (minute * 60) + second;
        //Q3
        System.out.println("It has been " + from_midnight + " seconds from midnight");
        int dayseconds = (24 * 60 * 60);
        int secondsleft = dayseconds - from_midnight;  // test
        //Q4
        System.out.println("There are " + secondsleft + " seconds left in the day");

        int daypercent = from_midnight*100 / dayseconds;
        //Q5
        System.out.println("At 3:23:20, " + daypercent + "% of the day has passed");
    }

}
