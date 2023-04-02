// program to count the occurence of 11 in a string
public class Array11 {
    public static void main(String[] args){
        int nums[] = {5,11,7,11,3,11};
        int index=0;
        int result=array11(nums,index);
        System.out.println(result);

    }
    public static int array11(int[] nums,int index){
        if(index>=nums.length)
        return 0;
        if(nums[index]==11)
        return 1+array11(nums,index+1);
        else 
        return array11(nums,index+1);

    }
    
}
