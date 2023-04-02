//program to check the array contains 6 or not,if the array contains 6 then return true ,otherwise false
public class Array6 {
    public static void main(String[] args){
        int nums[] = {2,4,8};
        int index=0;
        boolean  result=array(nums,index);
        System.out.println(result);
    }
    public static boolean array(int[]nums,int index){
        if(index>=nums.length)
        return false;
        if(nums[index]==6)
        return true;
        else 
        return array(nums,index+1);


    }
    
}
