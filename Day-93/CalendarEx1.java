import java.util.Calendar;

public class CalendarEx1 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println("current year:" + c.get(c.YEAR));// get() method returns the value of the given calendar field

        System.out.println("current Month:" + c.get(c.MONTH));

        System.out.println("current minute:" + c.get(c.MINUTE));

        System.out.println("current millisecond:" + c.get(c.MILLISECOND));

        System.out.println("current day of month:" + c.get(c.DAY_OF_MONTH));

        System.out.println("current week of month:" + c.get(c.WEEK_OF_MONTH));

    }
    
}
