package com.lowleveldesign.entities;

public class Card {
    public int cardNumber;
    public int expiry;
    public String cardHolder;
    public int pinNumber = 1234;
    public BankAccount bankAccount;

    //validate pin
    public boolean isValidPin(int pinNumber) {
        return this.pinNumber == pinNumber;
    }

    public int getBalance(){
        return bankAccount.getBalance();
    }

    public void deductBalance(int amount) {
        bankAccount.withDraw(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
