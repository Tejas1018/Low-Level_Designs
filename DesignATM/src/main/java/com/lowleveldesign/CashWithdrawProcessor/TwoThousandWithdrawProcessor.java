package com.lowleveldesign.CashWithdrawProcessor;

import com.lowleveldesign.entities.Atm;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {

    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    @Override
    public void withDraw(Atm atm, int remainingAmount) {
        int required = remainingAmount / 2000;
        int balance = remainingAmount % 2000;

        if(required <= remainingAmount) {
            atm.deductTwoThousandNotes(required);
        }
        else{
            atm.deductTwoThousandNotes(required);
            balance = balance + (required - atm.getNoOfTwoThousandNotes())*2000;
        }

        if(balance != 0){
            super.withDraw(atm,balance);
        }
    }

}
