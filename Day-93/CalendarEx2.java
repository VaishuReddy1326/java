// add() method is used to add or substract the current value from the given calendar field
import java.util.Calendar;

public class CalendarEx2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        
        calendar.add(Calendar.MONTH, 7);

        System.out.println(calendar.getTime());

        calendar.add(Calendar.DATE,-12);

        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR,-3);

        System.out.println(calendar.getTime());

    }
    
}
