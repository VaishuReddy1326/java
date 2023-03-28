/* If the number is multiplied by 3 then print fizz, the number is multiplied by 5 then print buzz, 
the number is multiplied by 3 and 5 then print fizzbuzz   */

public class FizzBuzz {
    public static void main(String[] args){
        for(int i=1;i<100;i++){
            if(i%3==0 && i%5==0)
                System.out.print("fizzbuzz"+" ");
                else if(i%3==0)
                System.out.print("fizz"+" ");
                else if(i%5==0)
                System.out.print("buzz"+" ");
                else 
                System.out.print(i +" "); 

            
        }
    }
    
}
