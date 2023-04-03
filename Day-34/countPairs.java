/*program to count the number of pairs with in the string
i/p: AXAXA
o/p : 3
*/
public class countPairs {
    public static void main(String[] args){
        String str="AXAXA";
        System.out.println(countpairs(str));
    }
    public static int countpairs(String str){
        if(str.length()<=2)
        return 0;
        if(str.charAt(0)==str.charAt(2))
        return 1+countpairs(str.substring(1));
        else 
        return countpairs(str.substring(1));
    }
    
}
