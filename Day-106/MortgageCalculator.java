import java.text.NumberFormat;
import java.time.Year;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        float monthlyRate;
        short numberOfPayments;

        while(true) {

            System.out.println("enter principal:");
            principal = sc.nextInt();
            if(principal >= 1000 && principal <= 1000000000)
                break;
            System.out.println("enter amount between 1000 and 1000000000");;
        }

        while(true) {

            System.out.println("Annual interest rate :");
            float yearlyRate = sc.nextFloat();
            if(yearlyRate >= 1 && yearlyRate <=48){
                monthlyRate = yearlyRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter interest rate between 1 to 48 percent");
        }

        while(true) {

            System.out.println("Time frame (in Years):");
            byte Years = sc.nextByte();
            if(Years >= 1 && Years <= 30){
                numberOfPayments = (short) (Years * MONTHS_IN_YEAR);
                break;
            }
             
            System.out.println("enter time frame between 1 to 30 years");        
        }
        double mortgage = principal * (monthlyRate*Math.pow((monthlyRate+1),numberOfPayments))/(Math.pow((monthlyRate+1),numberOfPayments)-1);

        String formatedMonthlyAmount = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("mortgage monthly :" +formatedMonthlyAmount);
        }

    }

    

