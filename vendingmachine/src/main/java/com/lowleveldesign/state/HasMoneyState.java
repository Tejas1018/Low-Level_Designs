package com.lowleveldesign.state;

import com.lowleveldesign.VendingMachine;
import com.lowleveldesign.enums.Coins;

public class HasMoneyState extends  VendingMachineState {
    public HasMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void  insertMoney(Coins coin) {
        System.out.println("Money already inserted.");
    }

    @Override
    public void selectProduct(String productCode) {
        System.out.println("Product already selected: " + productCode);
    }

    @Override
    public void dispenseProduct() {
        machine.setState(new DispenseState(machine));
        machine.dispenseItem();
    }

    @Override
    public void refundMoney() {
        machine.reset();
        machine.setState(new IdleState(machine));
        System.out.println("Transaction cancelled. Refunding money.");
    }

}
