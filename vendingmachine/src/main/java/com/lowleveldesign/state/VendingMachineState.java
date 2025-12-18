package com.lowleveldesign.state;

import com.lowleveldesign.VendingMachine;
import com.lowleveldesign.enums.Coins;

public abstract class VendingMachineState {
    VendingMachine machine;
    public VendingMachineState(VendingMachine machine) {
        this.machine = machine;
    }

    public abstract void insertMoney(Coins coin);
    public abstract void selectProduct(String productCode);
    public abstract void dispenseProduct();
    public abstract void refundMoney();
}
