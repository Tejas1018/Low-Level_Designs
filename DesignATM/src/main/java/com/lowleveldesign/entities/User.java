package com.lowleveldesign.entities;

public class User {
    public BankAccount bankAccount;
    public Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
