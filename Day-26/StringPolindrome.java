public class StringPolindrome {
    public static void main(String[] args){
        String str="amma";
        String rev="";
        for(int i=0;i<str.length();i++){
           rev = rev+str.charAt(str.length()-i-1);
        }
        if(rev==str)
         System.out.println("polindrome");
        else 
         System.out.println("not a polindrome");
    }
}
