package HW7;

import ZipCodes.Coordinate;

import java.util.ArrayList;

public class BankAccount {
    private String firstName, lastName; // first and last name in strings
    private String accNumber; // bank acc number that can have up to 10 numbers and the first digit can not be 0
    private String street, city, state, zipcode; //name of the street, city, two char state, and 5 digit string
    private double accBalance; // amount of money in the acc and can not go below 0
    private double interestRate; // interest rate between 1 - 100 that has to be divided by 100 to be the rate value

    public BankAccount(String firstName, String lastName, String accNumber, String street, String city, String state, String zipcode, double accBalance, double interestRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (accNumber.length() < 11 && accNumber.charAt(0) != '0'){
            this.accNumber = accNumber;
        }
        else {
            System.out.println("Error: Account number is incorrect. Account numbers have 1 to 10 digits and the first digit cannot be 0.");
        }
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.accBalance = accBalance;
        this.interestRate = interestRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accNumber=" + accNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", accBalance=" + accBalance +
                ", interestRate=" + interestRate +
                '}';
    }
    // the credit function add an amount to the bank account balance
    public double credit(double atm) {
        if (atm > 0) {
            this.accBalance = accBalance + atm;
        }
        return accBalance;
    }
    // the debit function subtracts an amount from the bank account balance
    public double debit(double atm) {
        if (atm > 0){
            if (this.accBalance == 0){
                return accBalance;
            }
            else {
                this.accBalance = accBalance - atm;
                if (accBalance < 0){
                    this.accBalance = 0;
                    return accBalance;
                }
                else {
                    System.out.println("yes");
                    return accBalance;
                }
            }
        }
        else {
            System.out.println("Error: Amount needs to be greater than $0.");
            return accBalance;
        }
    }
    // addinterest function increases the bank account balance by a certain rate
    public double addInterest() {
        if (this.interestRate > 0 && this.interestRate < 1) {
            this.accBalance = accBalance + (accBalance * this.interestRate);
        }
        return accBalance;
    }
    //Set the corresponding interest rate for each of the bank accs
    public void setInterestRate(double rate) {
        if (rate >= 0 && rate <= 100){
            rate = rate / 100;
            this.interestRate = rate;
        }
        else {
            System.out.println("Error: Interest rate percent must be greater than 0 and between 0 - 100.");
        }

    }


}