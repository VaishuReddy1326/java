// program to sum all the elements in array

public class Sum_ElementsInArray {
    public static void main(String[] args){
        int[] a={5,6,7,8,9,3,4,5};
        int[] b={5,6,7,8,1,2};
        int sum =0;
        int i,j;
        for( i=0,j=0;i<a.length && j<b.length ;i++,j++){     //while(i<a.length)    i=6,j=6
                                                                //    sum+= a[i++]
            sum +=a[i]+b[j];

        }
        while(i<a.length){
            sum+=a[i++];
        }
        while(j<b.length){
            sum+=b[j++];
        }
      

        
        System.out.println(sum);  //5+6+7+8+9+5+6+7+8+1+2 = 64

    }
    
}
