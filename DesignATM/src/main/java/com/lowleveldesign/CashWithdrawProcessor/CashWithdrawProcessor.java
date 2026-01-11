package com.lowleveldesign.CashWithdrawProcessor;

import com.lowleveldesign.entities.Atm;

public class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        this.nextCashWithdrawProcessor = nextCashWithdrawProcessor;
    }

    public void withDraw(Atm atm,int remainingAmount) {
        if(nextCashWithdrawProcessor != null) {
            nextCashWithdrawProcessor.withDraw(atm,remainingAmount);
        }
    }

}
