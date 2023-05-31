import java.util.Arrays;

public class ObjectOrientedThinkingEx {
    public static void main(String[] args) {

        Bank b1 = new Bank();
        b1.setBranchName("nellore");
        b1.setaccountNo(07011056567);
        b1.setaccountHolder("john");
        b1.setBalance(500000);

        System.out.println(b1);

        UnionBank ub = new UnionBank();
        ub.setBranchName("tirupathi");
        ub.setNoOfAccounts(5000);
        ub.setNoOfLoans(2780);
        ub.setwithdrawAmount(5000000);
 
        UnionBank ub1 = new UnionBank();
        ub1.setBranchName("kavali");
        ub1.setNoOfAccounts(3789);
        ub1.setNoOfLoans(0231);
        ub1.setwithdrawAmount(7000000);

        UnionBank[] bank = {ub,ub1};
        b1.setUnionbank(bank);
        System.out.println(b1);

    }
    
}
class Bank {
    private String branchName;
    private int accountNo;
    private String accountHolder;
    private int balance;

    UnionBank[] unionbank;


    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public int getaccountNo() {
        return accountNo;
    }
    public void setaccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getaccountHolder() {
        return accountHolder;
    }
    public void setaccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public UnionBank[] getunionbank() {
        return unionbank;
    }
    public void setUnionbank(UnionBank[] unionbank) {
        this.unionbank = unionbank;
    }
    @Override
    public String toString() {
       return "Bank" +
               "'branchName=" + branchName +'\'' +
               "'accountNo=" + accountNo +
               "'accountHolder=" + accountHolder +
               "'balance=" +balance +
               "'UnionBnak="+Arrays.toString(unionbank) +
               '}';
    }




}