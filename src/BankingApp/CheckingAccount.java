package BankingApp;

public class CheckingAccount extends BankAccount {
    private double rate;

    //construct is also named the same as the class

    public CheckingAccount(String name, double balance) {
        //supuer() in this context refers to the constructor in the super/base class ie BankAccount
        super(name, balance);
        this.rate = .01; // 1%
    }

    public double getRate() {
        return rate;
    }

}
