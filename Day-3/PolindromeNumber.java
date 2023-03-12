import java.util.Scanner;
public class PolindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int org_Num=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;


        }
        if(org_Num==rev){
            System.out.println("polindrome number");
        }
        else{
            System.out.println("not a polindrome number");
        }

    }
    
}
