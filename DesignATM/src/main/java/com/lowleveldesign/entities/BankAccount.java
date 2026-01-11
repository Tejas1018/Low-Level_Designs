package com.lowleveldesign.entities;

public class BankAccount {
    private int balance;

    public void withDraw(int amount) {
        balance = balance-amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
