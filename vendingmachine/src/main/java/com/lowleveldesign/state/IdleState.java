package com.lowleveldesign.state;

import com.lowleveldesign.VendingMachine;
import com.lowleveldesign.entities.Item;
import com.lowleveldesign.enums.Coins;

public class IdleState extends  VendingMachineState {
    public IdleState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertMoney(Coins coin) {
        System.out.println("Please insert money to proceed.");
    }

    @Override
    public void selectProduct(String productCode) {
        if(machine.getInventory().isAvailable(productCode)){
            machine.setSelectedItemCode(productCode);
            System.out.println("Product selected: " + productCode);
            machine.setState(new SelectProductState(machine));
        } else {
            System.out.println("Selected product is not available.");
        }
    }

    @Override
    public void dispenseProduct() {
        System.out.println("please select product first.");
    }

    @Override
    public void refundMoney() {
        System.out.println("No money to refund.");
    }
}
