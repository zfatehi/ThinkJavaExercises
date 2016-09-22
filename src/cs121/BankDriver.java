package cs121;

public class BankDriver {

    public static void main(String[] args) {
        BankAccount nicksAcct = new BankAccount("Nick", 450, 550);
        BankAccount carolsAcct = new BankAccount("Carol", 600, 700);
        nicksAcct.printReport();
        carolsAcct.printReport();
        System.out.print("Total money in all accounts: $");
        System.out.println(nicksAcct.getSaveMoney() + nicksAcct.getCheckMoney()
                + carolsAcct.getSaveMoney() + carolsAcct.getCheckMoney());
        nicksAcct.makeCheckingDeposit(100);
        nicksAcct.printReport();
        carolsAcct.makeCheckingDeposit(nicksAcct.getCheckMoney());
        carolsAcct.makeCheckingDeposit(nicksAcct.getSaveMoney());
        nicksAcct.makeCheckingWithdrawal(nicksAcct.getCheckMoney());
        nicksAcct.makeSavingsWithdrawal(nicksAcct.getSaveMoney());
        nicksAcct.printReport();
        carolsAcct.printReport();
    }

}
