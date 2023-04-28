import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();  //display current date

        System.out.println(date);

        LocalTime time = LocalTime.now();  //display current time

        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now(); // display current date and time

        System.out.println(datetime);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-DD");

        System.out.println(format1);

        DateTimeFormatter d= DateTimeFormatter.ofPattern("DD-MM-YYYY  HH:MM:SS");
        
        datetime.format(d);

        System.out.println(datetime);
    }
    
}
