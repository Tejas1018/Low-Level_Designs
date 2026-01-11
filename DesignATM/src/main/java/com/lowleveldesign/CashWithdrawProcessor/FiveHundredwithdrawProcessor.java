package com.lowleveldesign.CashWithdrawProcessor;

import com.lowleveldesign.entities.Atm;

public class FiveHundredwithdrawProcessor extends CashWithdrawProcessor {

    public FiveHundredwithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withDraw(Atm atm, int remainingAmount) {
        int required = remainingAmount / 500;
        int balance = remainingAmount % 500;

        if(required <= remainingAmount) {
            atm.deductFiveHundredNotes(required);
        }
        else if(required > atm.getNoOfFiveHundredNotes()){
            atm.deductFiveHundredNotes(required);
            balance = balance + (required - atm.getNoOfFiveHundredNotes())*500;
        }

        if(balance != 0){
            super.withDraw(atm,balance);
        }
    }
}
