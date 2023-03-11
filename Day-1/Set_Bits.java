
import java.util.Scanner;
class Power_of_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
int n=sc.nextInt();
int count=0;
while(n>0){
    n=n&(n-1);
    count++;
}
if(count==1)
System.out.println("power of 2");
else
System.out.println("not a power of 2");
}
}
System.out.println("mask:"+mask);
}
}