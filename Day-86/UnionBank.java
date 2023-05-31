public class UnionBank {
    private String branchname;
    private int noOfLoans;
    private int noOfAccounts;
    private int withdrawAmount;

    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchName) {
        this.branchname = branchname;
    }
    public int getNoOfLoans() {
        return noOfLoans;
    }
    public void setNoOfLoans(int noOfLoans) {
        this.noOfLoans = noOfLoans;
    }
    public int getNoOfAccounts() {
        return noOfAccounts;
    }
    public void setNoOfAccounts(int noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }
    public int getwithdrawAmount() {
        return withdrawAmount;
    }
    public void setwithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    @Override
    public String toString() {
        return "UnionBank" +
                "'branchname=" + branchname +'\''+
                "'noofaccounts=" + noOfAccounts +
                "'noofloans=" + noOfLoans +
                "'withdrawAmount=" + withdrawAmount +
                '}';
    }


    
}
