package com.lowleveldesign.ATMStates;

import com.lowleveldesign.entities.Atm;
import com.lowleveldesign.entities.Card;
import com.lowleveldesign.entities.TransactionType;

public abstract class AtmState {

    public void insertCard(Atm atm, Card card) {
        System.out.println("SOMETHING WENT WRONG");
    }

    public void hasCard(Atm atm, Card card, int pinNumber) {
        System.out.println("SOMETHING WENT WRONG");
    }

    public void selectOperation(Atm atm, Card card, TransactionType transactionType) {
        System.out.println("SOMETHING WENT WRONG");
    }

    public void withdraw(Atm atm, Card card,int amount) {
        System.out.println("SOMETHING WENT WRONG");
    }

    public void checkBalance(Atm atm,Card card) {
        System.out.println("SOMETHING WENT WRONG");
    }

    public void ejectCard(Atm atm) {
        System.out.println("SOMETHING WENT WRONG");
    }
}

