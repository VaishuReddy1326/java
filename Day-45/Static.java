import javax.lang.model.util.ElementScanner14;

public class Static {
    public static void main(String[] args){
        NetWorth parent=new NetWorth();
        NetWorth son1=new NetWorth();
        NetWorth son2=new NetWorth();
        NetWorth daughter=new NetWorth();
        son1.capicono();
        daughter.sellProperty(10000);
        son2.collegeFee(3);
        System.out.println(NetWorth.x);

    }
    
}
class NetWorth{
    static int x=10000000;
    void capicono(){
        x-=200;

    }
    void sellProperty(int val){
        x+=val;
    }
    void collegeFee(int tier){
        if(tier==1)
          x-=5000000;
        else if(tier==2)
          x-=3000000;
        else if(tier==3)
          x-=1000000;
        else 
          x-=50000;

    }
}
