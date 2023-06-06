import java.util.Calendar;

public class CalendarEx {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance(); // returns a calendar instance based on the current time with default zone

        System.out.println(c.getTime()); // return the current time
    }
    
}
