/*print the occurence of elements in the string
I/p : ffffggeebyd
o/p : f4g2e2byd;
*/
public class OccurenceOfElement {
    public static void main(String[] args){
        String str = "ffffggeebyd";
        for(int i=0;i<str.length();i++){
            int count=1;
            int j;
            for( j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                 count++;
                 else 
                 break;

            }
            if(count==1)
              System.out.print(str.charAt(i));
            else 
              System.out.print(str.charAt(i)+Integer.toString(count));
            i=j-1;
        }
    }
    
}
