import java.util.Calendar;

public class CalendarMax {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);

        System.out.println("maximum no.of days in a week "+max);

        max = calendar.getMaximum(Calendar.WEEK_OF_MONTH);

        System.out.println("maximum no.of weeks in a month" +max);
    }
}