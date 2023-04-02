public class Array220 {
    public static void main(String[] args){
        int[] nums = {1,3,30};
        int index = 0;
        System.out.println(array(nums,index));

    }
    public static boolean array(int[] nums,int index ){
        if(index>=nums.length-1)
        return false;
        if(nums[index]*10==nums[index+1])
        return true;
        else 
        return array(nums,index+1);

    }
    
}
