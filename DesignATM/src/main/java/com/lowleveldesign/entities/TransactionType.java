package com.lowleveldesign.entities;

public enum TransactionType {
    CASH_WITHDRAW,
    CHECK_BALANCE;

    // show all transaction types are present to the users in the display
    public void showAllOperations() {
        for(TransactionType txnType : TransactionType.values()){
            System.out.println(txnType);
        }
    }
}
