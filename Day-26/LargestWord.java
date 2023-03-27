public class LargestWord {
    public static void main(String[] args){
        String str="java is a good language";
        String str1=str+" ";
        int start=0;
        int max=Integer.MIN_VALUE;  
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!= ' '){
                start++;
            }
            else if(start>max){
                max=start;
                start=0;
            
            }
            
        }
        System.out.println("largest word is:"+max);
    }
    
}
