package HW7;

import ZipCodes.Coordinate;

public class BankAccount {
    private String firstName, lastName;
    private int accNumber;
    private String street, city, state, zipcode;
    private double accBalance;
    private double interestRate;

    public BankAccount(String firstName, String lastName, int accNumber, String street, String city, String state, String zipcode, double accBalance, double interestRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNumber = accNumber;
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

    public int getAccNumber() {
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
    public double credit(BankAccount that) {
        return -1;
    }
}