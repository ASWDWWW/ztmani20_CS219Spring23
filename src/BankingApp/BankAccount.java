package BankingApp;

public abstract class BankAccount {
    // protected keyword to be visible in classes under the bankaccount class
    protected String name;
    protected double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void credit(double amt){
        balance += amt;
    }
// can make methods abstract as well
    public abstract double getRate();
    public void addInterest(){
        balance *= (1 + getRate());
    }
}
