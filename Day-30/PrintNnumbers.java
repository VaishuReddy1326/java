public class PrintNnumbers {
    public static void main(String[] args){
        int n=4;
        numbers(n);

    }
    public static void numbers(int n){
        if(n==0)
        return ;
        System.out.println(n--);
        numbers(n);
    }
    
}
