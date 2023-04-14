package HW7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // no errors
        BankAccount p1 = new BankAccount("Zakiy", "Manigo", "2312343403", "Broadway", "Elizabeth", "NJ", "07206", 20000, 10);
        // interestRate Error
        BankAccount p2 = new BankAccount("John", "Stark", "364840", "Mary St", "Los Angeles", "CA", "90001", 1000000, -5);
        // debit errror and accNumber
        BankAccount p3 = new BankAccount("Matthew", "Johnson", "14939289765", "Grove St", "Fargo", "ND", "58102", 0, 5);
        // accNumber error and debit error
        BankAccount p4 = new BankAccount("Matthew", "Johnson", "0494522", "Clark Ave", "Billings", "MT", "59101", 100, 5);



        // Test objects with correct values
        BankAccount p5 = new BankAccount("John", "Stark", "364840", "Mary St", "Los Angeles", "CA", "90001", 1000000, 5);
        // debit errror and accNumber
        BankAccount p6 = new BankAccount("Matthew", "Johnson", "14939265", "Grove St", "Fargo", "ND", "58102", 500, 5);
        // accNumber error and debit error
        BankAccount p7 = new BankAccount("Matthew", "Johnson", "1494522", "Clark Ave", "Billings", "MT", "59101", 100, 5);

//        System.out.println(p1);System.out.println(p2);System.out.println(p3);System.out.println(p4);
//        System.out.println();
        System.out.println(p1.credit(200));
        System.out.println(p2.credit(200));
        System.out.println(p4.credit(200));

        System.out.println();

        System.out.println(p1.debit(200));
        System.out.println(p2.debit(200));
        System.out.println(p3.debit(200));
        System.out.println(p4.debit(400));

        System.out.println();

        p1.setInterestRate(p1.getInterestRate());
        p2.setInterestRate(p2.getInterestRate());
        p3.setInterestRate(p3.getInterestRate());
        p4.setInterestRate(p4.getInterestRate());

        System.out.println(p1.addInterest());
        System.out.println(p2.addInterest());
        System.out.println(p3.addInterest());
        System.out.println(p4.addInterest());

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(p5);
        accounts.add(p6);
        accounts.add(p7);

        System.out.println();

        p1.displayAccounts(accounts);



    }






}
