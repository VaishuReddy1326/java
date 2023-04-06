public class LargestNum {
    public static void main(String[] args){
        int n=4536;
        int max=0;
        int place=1;
        while(n/place>0){
            int num=n/(place*10)*place+n%place;
            if(num>max)
             max=num;
             place*=10;
        }
        System.out.println(max);


    }
    
}
