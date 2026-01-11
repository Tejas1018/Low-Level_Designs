package com.lowleveldesign.ATMStates;

import com.lowleveldesign.entities.Atm;
import com.lowleveldesign.entities.Card;

public class HasCardState extends AtmState{



    @Override
    public void hasCard(Atm atm, Card card, int pinNumber) {
        boolean isCardValidated = card.isValidPin(pinNumber);

        if(isCardValidated) {
            System.out.println("CARD PIN VALIDATED");
            atm.setAtmState(new SelectOperationState());
        }
        else{
            System.out.println("CARD PIN NOT VALIDATED");
            ejectCard(atm);
        }

    }

    @Override
    public void ejectCard(Atm atm) {
        atm.setCurrentAtmState(new IdleState());
    }
}
