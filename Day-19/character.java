import java.util.Arrays;
public class character {
    public static void main(String[] args){
        char[] arr={'h','e','l','l','o'};
        System.out.println(Arrays.toString(arr));
        arr[2]='w';    //characters are mutable so the character will be changed
        System.out.println(Arrays.toString(arr));


    }
    
}

/*
 output:
 [h,e,l,l,o]
 [h,e,w,l,o]
 */