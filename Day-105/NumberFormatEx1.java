import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatEx1 {
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));

        double d = 2345.78;

        for(var a : NumberFormat.getAvailableLocales())
          System.out.println(a);

        for(var x : Currency.getAvailableCurrencies())
          System.out.println(x);

        String result = NumberFormat.getPercentInstance().format(0.5);
        System.out.println(result);

        String result1 = NumberFormat.getPercentInstance().format(5);
        System.out.println(result1); 

      


    }
    
}
