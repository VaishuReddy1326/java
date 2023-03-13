//program for N multiplication tables
import java.util.Scanner;

public class N_Multiplication_Tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            for(int j=1;j<=n;j++){
                System.out.println(j+"*"+i+"="+(i*j)+"\t");
            }
        }
    }
    
}
