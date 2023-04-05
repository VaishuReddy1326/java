public class lengthOfString {
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(strlen(str));

    }
    public static int strlen(String str) {
        if(str.length()==0)
        return 0;
        return 1+strlen(str.substring(1));
    }
    
}
