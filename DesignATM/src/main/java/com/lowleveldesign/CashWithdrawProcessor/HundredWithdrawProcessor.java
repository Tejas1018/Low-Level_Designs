package com.lowleveldesign.CashWithdrawProcessor;

import com.lowleveldesign.entities.Atm;

public class HundredWithdrawProcessor extends CashWithdrawProcessor {

    public HundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withDraw(Atm atm, int remainingAmount) {
        int required = remainingAmount / 100;
        int balance = remainingAmount % 100;

        // Logic to remove required amount from ATM

        if(required <= remainingAmount) {
            atm.deductHundredNotes(required);
        }
        else if(required > atm.getNoOfHundredNotes()){
            atm.deductHundredNotes(required);
            balance = balance + (required - atm.getNoOfHundredNotes())*100;
        }

        if(balance != 0){
            super.withDraw(atm,balance);
        }
    }
}
