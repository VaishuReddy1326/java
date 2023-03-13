//program to find random number between 100 to 1000
public class Random_Numbers {
    public static void main(String[] args) {
        int min=100;
        int max=1000;
        System.out.println("random number is:"+min +" to  " +max+"");
        int c= (int)(Math.random()*(max-min+1)+min);
        System.out.println(c);
    }
    
}
