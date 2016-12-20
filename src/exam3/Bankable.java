package exam3;

public interface Bankable {

    public boolean makeWithdrawal(int amt);

    public void makeDeposit(int amt);

    public int getBalance();

    public int compareTo(Bankable otherAcct);

}
