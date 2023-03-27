public class StringContainsSubstring {
    public static void main(String[] args){
        String str1="helloworld";
        String str2="wor";
        for(int i=0;i<str1.length();i++){
            int count=0;int k=i+1;
           if(str1.charAt(i)==str2.charAt(0)){
            for(int j=1;j<str2.length();j++){
                if(str2.charAt(j)!=str1.charAt(k)){
                count++;
                break;
            }
            k++;
           }
           if(count==0){
            System.out.println("yes");
            return;
           }
        }
    }
    System.out.println("no");
        
        
    }
    
    
}
