package com.lowleveldesign.ATMStates;

import com.lowleveldesign.entities.Atm;
import com.lowleveldesign.entities.Card;

public class IdleState extends AtmState{

    @Override
    public void insertCard(Atm atm, Card card) {
        System.out.println("INSERTING CARD");
        atm.setAtmState(new HasCardState());
    }

}
