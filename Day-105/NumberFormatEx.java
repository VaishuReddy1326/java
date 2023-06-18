import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatEx {
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en" ,"US"));

        int x = 4567;

        System.out.println(nf.format(x));

        nf.setCurrency(Currency.getInstance(Locale.FRANCE));

        System.out.println(nf.format(x));
    }
    
}
