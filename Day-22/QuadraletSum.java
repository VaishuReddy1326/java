

public class QuadraletSum {
    public static void main(String[] args){
        int a[] = {2,3,4,5,7,8,9,1};
        int sum=13;
        for(int i=0;i<a.length-3;i++){
            for(int j=i+1;j<a.length-2;j++ ){
               for(int k=j+1;k<a.length-1;k++){
                    for(int l=k+1;l<a.length;l++){
                        if(a[i]+a[j]+a[k]+a[i]==sum){
                            System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]);
                        }
                    }
                }
            }
        }
    }
    
}
