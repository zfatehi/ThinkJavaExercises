package exam3;

public class CheckingAccount implements Bankable {
    private String acctID;
    private String acctName;
    private int balance;
    private int numChecks;

    public CheckingAccount(String id, String name, int bal, int nc) {
        acctID = id;
        acctName = name;
        balance = bal;
        numChecks = nc;
    }

    public String getID() {
        return acctID;
    }

    public String getName() {
        return acctName;
    }

    public int getNumChecks() {
        return numChecks;
    }

    public boolean makeWithdrawal(int amt) {
        // If the amount passed in is less than or equal to the balance, the
        // //subtraction is made and true is returned.
        // If the amount passed in is greater than the balance, no subtraction
        // is //made and false is returned.
        if (balance > amt) {
            balance = balance - amt;
            return true;
        } else {
            return false;
        }
    }

    public void makeDeposit(int amt) {
        balance = balance + amt;
    }

    public int getBalance() {
        return balance;
    }

    public int compareTo(Bankable otherAcct) {
        // return *any* negative number, if *this* is less then other
        // return 0 if they are equal
        // return *any* positive number, if *this* is less then other
        // if you are working with integers, do *this* - other!
        return this.getBalance() - otherAcct.getBalance();
    }

}