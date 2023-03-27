
//program to print the unique characters in the given string
public class UniqueChar {
    public static void main(String[] args){
        String str="helloworld";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i))
                count++;
            }
            if(count==1)
            System.out.println(str.charAt(i));
        }


    }
    
}
