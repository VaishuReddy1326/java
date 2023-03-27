/* program to capitalize the first word in everyletter
input: java      is a programming language
output:Java Is A Programming Language */
public class CapitalizeFirstLetter {
    public static void main(String[] args){
        String str="java is a programming language";
    
        for(int i=0;i<str.length();i++){
          
           if(i==0){
            str+=Character.toUpperCase(str.charAt(i));
        
           }
           else if(str.charAt(i-1)==' '){
            str+=Character.toUpperCase(str.charAt(i));
            
           }
            else{
                str+=str.charAt(i);

           }
           System.out.print(str);
           
        

        }
    
    
    }
    
}
