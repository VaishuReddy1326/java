public class numberLength {
    public static void main(String[] args){
        int num=43656;
        System.out.print(numlen(num));
    }
    public static int numlen(int num) {
        if(num==0)
        return 0;
        return 1+numlen(num/10);
    }
    
}
