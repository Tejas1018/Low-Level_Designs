package com.lowleveldesign;

import com.lowleveldesign.entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATMRoom {
    Atm atm;
    User user;
    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.atm.printATMStatus();
        atmRoom.atm.getCurrentAtmState().insertCard(atmRoom.atm,atmRoom.user.getCard());
        atmRoom.atm.getCurrentAtmState().hasCard(atmRoom.atm,atmRoom.user.getCard(),1234);
        atmRoom.atm.getCurrentAtmState().selectOperation(atmRoom.atm,atmRoom.user.getCard(), TransactionType.CASH_WITHDRAW);
        atmRoom.atm.getCurrentAtmState().withdraw(atmRoom.atm,atmRoom.user.getCard(),600);
        atmRoom.atm.getCurrentAtmState().ejectCard(atmRoom.atm);
        atmRoom.atm.printATMStatus();
    }

    public void initialize(){
        atm = Atm.getINSTANCE();
        atm.setAtmBalance(4000,1,2,10);

        this.user = createUser();
    }

    public User createUser(){
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    public Card createCard(){
        Card card = new Card();
        card.setBankAccount(createBankaccount());
        return card;
    }
    public BankAccount createBankaccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(2800);
        return bankAccount;
    }
}