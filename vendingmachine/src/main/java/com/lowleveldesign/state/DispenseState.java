package com.lowleveldesign.state;

import com.lowleveldesign.VendingMachine;
import com.lowleveldesign.enums.Coins;

public class DispenseState extends VendingMachineState{
    public DispenseState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertMoney(Coins coin) {
        System.out.println("Money already inserted.");
    }

    @Override
    public void selectProduct(String productCode) {
        System.out.println("Product already selected: " + productCode);
    }

    @Override
    public void dispenseProduct() {
        // Dispense the item
    }

    @Override
    public void refundMoney() {
        machine.reset();
        machine.setState(new IdleState(machine));
        System.out.println("Transaction cancelled. Refunding money.");
    }
}
