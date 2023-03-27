//program to check the same characters in both strings or not
public class CheckSameCharString {
    public static void main(String[] args){
        String str1="abba";
        String str2="baca";
        if(str1.length()!=str2.length()){
            System.out.println("not matching");
            return;
        }
        int s1=0,s2=0;
        for(var x:str1.toCharArray()){
            s1+=x;
            
        }
        for(var x:str2.toCharArray()){
            s2+=x;
        }
        if(s1==s2){
            System.out.println("matching");
        }
        else
        System.out.println("not  matching");
        
         
    }

    
}
