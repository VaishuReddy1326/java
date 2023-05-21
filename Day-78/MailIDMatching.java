import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MailIDMatching {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String Gmail = "[a-zA-z0-9]{6,29}@[a-z]{3,}[.][a-z]{2,}";
        int count = 0;
        boolean res;
        int wait = 1000;
        do{
            System.out.println("enter your mail Id:");
            String input = sc.next();
            res = Pattern.matches(Gmail,input);

            if(res)
                System.out.println("valid mail Id");
            else {
                System.out.println("enter valid mailID");
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
