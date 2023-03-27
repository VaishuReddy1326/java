public class StringPolindrome1 {
    public static void main(String[] args){
        String str="rotator";
        String rev="";
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1))
               System.out.println("not a polindrome");
        }
        System.out.println("polindrome");
    }
    
}
