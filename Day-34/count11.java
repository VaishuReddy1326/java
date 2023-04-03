// program to print the number of 11's in the string.that 11 should not overlaps
public class count11 {
    public static void main(String[] args){
        String str="ab11c11";
        System.out.println(Count11(str));
    }
    public static int Count11(String str){
        if(str.length()<2)
        return 0;
        if(str.substring(0,2).equals("11"))
        return 1+Count11(str.substring(2));
        else 
        return Count11(str.substring(1));
    }
    
}
