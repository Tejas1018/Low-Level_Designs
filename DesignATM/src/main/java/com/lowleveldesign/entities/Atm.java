package com.lowleveldesign.entities;

import com.lowleveldesign.ATMStates.AtmState;
import com.lowleveldesign.ATMStates.IdleState;

import java.util.jar.JarOutputStream;

public class Atm {

    public static Atm atmObject = new Atm();

    public AtmState currentAtmState;
    private int atmBalance;
    private int noOfTwoThousandNotes;
    private int noOfFiveHundredNotes;
    private int noOfHundredNotes;

    public void setAtmState(AtmState atmState) {
        this.currentAtmState = atmState;
    }

    private Atm(){
        //
    }

    // singleton class of ATM
    public static Atm getINSTANCE() {
       atmObject.setAtmState(new IdleState());
       return atmObject;
    }
    // method to deduct user money from the atm
    public void deductAtmBalance(int amount) {
        atmBalance = atmBalance-amount;
    }

    public void setAtmBalance(int amount,int noOfTwoThousandNotes,int noOfFiveHundredNotes,int noOfHundredNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfHundredNotes = noOfHundredNotes;
        this.atmBalance = amount;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }



    public AtmState getCurrentAtmState() {
        return currentAtmState;
    }

    public void deductTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = this.noOfTwoThousandNotes - noOfTwoThousandNotes;
    }

    public void deductFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = this.noOfFiveHundredNotes - noOfFiveHundredNotes;
    }

    public void deductHundredNotes(int noOfHundredNotes) {
        this.noOfHundredNotes = this.noOfHundredNotes - noOfHundredNotes;
    }

    public void setCurrentAtmState(AtmState currentAtmState) {
        this.currentAtmState = currentAtmState;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfHundredNotes() {
        return noOfHundredNotes;
    }

    public void setNoOfHundredNotes(int noOfHundredNotes) {
        this.noOfHundredNotes = noOfHundredNotes;
    }

    public void printATMStatus(){
        System.out.println("ATM STATUS");
        System.out.println("ATM Amount :" + atmBalance);
        System.out.println("NoOfTwoThousandNotes :" + noOfTwoThousandNotes);
        System.out.println("NoOfFiveHundredNotes :" + noOfFiveHundredNotes);
        System.out.println("NoOfHundredNotes :" + noOfHundredNotes);
    }
}
