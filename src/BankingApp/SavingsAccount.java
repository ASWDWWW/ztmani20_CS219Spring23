package BankingApp;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public double getRate() {
        //TODO Make hard code number constant in the class
        if (balance < 50000){
            return .02;
        }
        else {
            return .03;
        }
    }

}
