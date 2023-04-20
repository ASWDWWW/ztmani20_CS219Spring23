package BankingApp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ca1 is both a BankAccount and a CheckingAccount
        BankAccount ca1 = new CheckingAccount("Hermione", 10000);
        BankAccount sa1 = new SavingsAccount("Harry",4000000);

//        cannont do this an abstract class
//        BankAccount Ba1 = new BankAccount("Draco",0);

        ca1.addInterest();
        sa1.addInterest();

        ArrayList<BankAccount> accts = new ArrayList<>();
        accts.add(ca1);
        accts.add(sa1);
        accts.add(new SavingsAccount("Ron", 500));

    }
}
