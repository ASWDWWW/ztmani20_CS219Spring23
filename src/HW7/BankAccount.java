package HW7;

import ZipCodes.Coordinate;

public class BankAccount {
    private String firstName, lastName;
    private String accNumber;
    private String street, city, state, zipcode;
    private double accBalance;
    private double interestRate;

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
    public double credit(double atm) {
        if (atm > 0) {
            this.accBalance = accBalance + atm;
        }
        return this.accBalance;
    }
    public double debit(double atm) {
        if (atm > 0){
            if (this.accBalance == 0){
                return accBalance;
            }
            else {
                this.accBalance = accBalance - atm;
                if (accBalance < 0){
                    return 0;
                }
                else {
                    return accBalance;
                }
            }
        }
        else {
            System.out.println("Error: Amount needs to be greater than $0.");
            return accBalance;
        }
    }
    public double addInterest(double rate) {
            this.accBalance = accBalance + (accBalance * rate);
            return accBalance;
    }
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