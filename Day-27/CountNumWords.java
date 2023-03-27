//program to remove the extra spaces

public class CountNumWords {
    public static void main(String[] args){
        String str="welcome to        java";
        int words=0;
        for(var x:str.toCharArray()){
            if(x==' ')
            words++;

        }
        String x[]=str.split("\\s+");

      
        System.out.print(x[2]);
    }
}