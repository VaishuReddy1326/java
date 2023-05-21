import java.util.Scanner;
import java.util.regex.Pattern;

public class PanCardMatching {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String panNo = "[A-Z]{3}[PFCHAT][A-Z]{1}[\\d]{4}[A-Z]";
        int count = 0;
        boolean res;
        int wait = 1000;

        do{
            System.out.println("enter your pan number:");
            String input = sc.next();
            res = Pattern.matches(panNo,input);

            if(res)
                System.out.println("valid pan number found");
            else {
                System.out.println("enter valid pan number");
                count++;
                if(count >= 5) {
                    int time = wait/1000;
                    int time1 = time;
                    for(int i = 0 ; i < time;i++) {
                        System.out.println("try again in "+time1+" seconds");
                        time1--;
                        Thread.sleep(time);
                    }
                    wait *= 2;

                }
            }
        } while(!res);
        sc.close();
    }
    
}
