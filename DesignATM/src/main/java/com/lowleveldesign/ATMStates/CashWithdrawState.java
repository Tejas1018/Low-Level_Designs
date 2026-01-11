package com.lowleveldesign.ATMStates;

import com.lowleveldesign.CashWithdrawProcessor.CashWithdrawProcessor;
import com.lowleveldesign.CashWithdrawProcessor.FiveHundredwithdrawProcessor;
import com.lowleveldesign.CashWithdrawProcessor.HundredWithdrawProcessor;
import com.lowleveldesign.CashWithdrawProcessor.TwoThousandWithdrawProcessor;
import com.lowleveldesign.entities.Atm;
import com.lowleveldesign.entities.Card;

public class CashWithdrawState extends  AtmState{

    @Override
    public void withdraw(Atm atm, Card card, int withDrawRequestAmount) {
        if (atm.getAtmBalance() < withDrawRequestAmount) {
            System.out.println("Insufficient fund in the ATM Machine");
            ejectCard(atm);
        } else if (card.getBalance() < withDrawRequestAmount) {
            System.out.println("Insufficient fund in the your Bank Account");
            ejectCard(atm);
        } else {
            // Deduct money from user account and ATM account
            card.deductBalance(withDrawRequestAmount);
            atm.deductAtmBalance(withDrawRequestAmount);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredwithdrawProcessor(new HundredWithdrawProcessor(null)));

            withdrawProcessor.withDraw(atm, withDrawRequestAmount);
            ejectCard(atm);
        }

    }
}
