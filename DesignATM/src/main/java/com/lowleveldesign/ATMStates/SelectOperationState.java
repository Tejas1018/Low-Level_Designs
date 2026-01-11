package com.lowleveldesign.ATMStates;

import com.lowleveldesign.entities.Atm;
import com.lowleveldesign.entities.Card;
import com.lowleveldesign.entities.TransactionType;

public class SelectOperationState extends AtmState{

    @Override
    public void selectOperation(Atm atm, Card card, TransactionType transactionType) {
        switch(transactionType) {

                case CASH_WITHDRAW:
                    System.out.println("CASH_WITHDRAW");
                    atm.setAtmState(new CashWithdrawState());
                    break;
                case CHECK_BALANCE:
                    System.out.println("CHECK_BALANCE");
                    atm.setAtmState(new CheckBalanceState());
                    break;

            default:
                System.out.println("Select correct option..!!");
                break;
        }
    }
}
