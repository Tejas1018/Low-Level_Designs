package com.lowleveldesign.state;

import com.lowleveldesign.VendingMachine;
import com.lowleveldesign.enums.Coins;

public class SelectProductState extends VendingMachineState{
    public SelectProductState(VendingMachine machine) {
        super(machine);
    }



    @Override
    public void insertMoney(Coins coin) {
        machine.addMoney(coin.getValue());
        System.out.println("Coin Inserted: " + coin.getValue());
        double itemPrice =  machine.getInventory().getItem(machine.selectedItemCode).getPrice();
        if(itemPrice <= machine.getBalance()){
            machine.setState(new DispenseState(machine));
            machine.dispenseItem();
        } else {
            System.out.println("Please insert more money. Item price is: " + itemPrice);
        }
    }

    @Override
    public void selectProduct(String productCode) {
        System.out.println("Product already selected: " + productCode);
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert money to dispense the product.");
    }

    @Override
    public void refundMoney() {
        machine.reset();
        machine.setState(new IdleState(machine));
        System.out.println("Transaction cancelled. Refunding money.");
    }
}
