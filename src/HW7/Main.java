package HW7;

public class Main {
    // not errors
    BankAccount p1 = new BankAccount("Zakiy", "Manigo", "2312343403", "Broadway", "Elizabeth", "NJ", "07206", 20000, 10);
    // interestRate Error
    BankAccount p2 = new BankAccount("John", "Stark", "364846380", "Mary St", "Los Angeles", "CA", "90001", 1000000, -5);
    // debit errror
    BankAccount p3 = new BankAccount("Matthew", "Johnson", "149392", "Grove St", "Fargo", "ND", "58102", 0, 5);
    // accNumber error
    BankAccount p4 = new BankAccount("Matthew", "Johnson", "0494522", "Clark Ave", "Billings", "MT", "59101", 500, 1);



}
