//program for linear search

public class Linear_Search {
    public static void main(String[] args){
        int arr[]={5,4,6,2,1};
        int Search_ele = 2;
        boolean flag=false;
        for (int i=0;i<=arr.length-1;i++) {
            if(Search_ele==arr[i]){
                System.out.println("element found");
                flag=true;
            }
          
        }
        if(flag==false){
        System.out.println("element not found");
        }
        
    }
    
}
