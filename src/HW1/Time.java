package HW1;


public class Time {
    // void is the return type and main is the method name
    public static void main(String[] args) {
        //header before the question answers
        System.out.println("HW1");
        //Q2
        // static variables with values for the time
        int hour = 15;
        int minute = 23;
        int second = 20;
        //computation of how many seconds is 2:23:20PM
        int from_midnight = (hour * 60 * 60) + (minute * 60) + second;
        //Q3
        //print out the amount of seconds from midnight
        System.out.println("It has been " + from_midnight + " seconds from midnight");
        //computation for seconds in a day
        int dayseconds = (24 * 60 * 60);
        //computation for seconds left in the day
        int secondsleft = dayseconds - from_midnight;
        //Q4
        //print the amount of seconds left in the day
        System.out.println("There are " + secondsleft + " seconds left in the day");
        //computation c
        int daypercent = from_midnight*100 / dayseconds;
        //Q5
        //print the percent of the day that has passed rounded to the nearest integer
        System.out.println("At 3:23:20, " + Math.round(daypercent) + "% of the day has passed");
    }

}
