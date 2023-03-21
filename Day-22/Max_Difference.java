

public class Max_Difference {
    public static void main(String[] args){
        int a[]={3,5,6,7,9,1};
        int minIndex=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<a[minIndex])
            minIndex=i;
        }
        
        int bigIndex=minIndex+1;
        for(int i=minIndex-2;i<a.length;i++){
            if(a[i]>bigIndex)
            bigIndex=i;
        } 
        System.out.println(a[bigIndex]-a[minIndex]);
  }
    
}
