

public class strDist {
    public static void main(String[] args) {
        String str = "catcowcat";
        String sub = "cat";
        System.out.println(strdist(str,sub)); 
    }
    public static int strdist(String str,String sub){
        int strlen=str.length();
        int sublen=sub.length();
        if(sublen>strlen)
        return 0;
        if(str.substring(0,sublen).equals(sub)){
            if(str.substring(strlen-sublen).equals(sub))
            return str.length();
            else 
            return strdist(str.substring(0,strlen-1),sub);

        }
        else 
        return strdist(str.substring(1),sub);
    }
    
}
