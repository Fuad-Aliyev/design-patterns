package main.creational.factory;

public class ForeignBusinessAccount implements BankAccount {
    String name = "Foreign Business Account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": registering account");
    }
}
