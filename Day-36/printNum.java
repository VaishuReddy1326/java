// program to print the number from 1 to n

public class printNum {
    public static void main(String[] args){
        int n=10;
        print(n,1);
    }
    public static void print(int n,int start) {
        if(n<start)
        return;
        System.out.print(start+" ");
        print(n,start+1);
    }
    
}
