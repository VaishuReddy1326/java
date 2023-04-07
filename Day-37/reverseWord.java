public class reverseWord {
    public static void main(String[] args){
        String str="hello world";
        String res=" ";
        int end=str.length();
        for(int i=end-1;i>=0;i--){
            res+=str.charAt(i);
         
        }
        System.out.println(res);
    }
    
}
