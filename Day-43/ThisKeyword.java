// this keyword represents the current object

public class ThisKeyword {
    int a,b;
    ThisKeyword(){
        this.a=10;
        this.b=20;
    }
    public static void main(String[] args){
       ThisKeyword t=new ThisKeyword();
       System.out.println(t.a);
    }
    
}
