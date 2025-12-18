package com.lowleveldesign;

import com.lowleveldesign.entities.Inventory;
import com.lowleveldesign.entities.Item;
import com.lowleveldesign.enums.Coins;
import com.lowleveldesign.state.IdleState;
import com.lowleveldesign.state.VendingMachineState;

public class VendingMachine {
    private static final VendingMachine INSTANCE = new VendingMachine();
    private Inventory inventory = new Inventory();
    private double balance = 0;
    public String selectedItemCode;
    private VendingMachineState currentState;

    public VendingMachine(){
        currentState = new IdleState(this);
    }
    public static VendingMachine getInstance() {
        return INSTANCE;
    }

    public Item addItem(String itemCode, String itemName,double price, int quantity) {
        Item item = new Item(itemCode, itemName, price);
        inventory.addItem(item, quantity);
        return item;
    }

    public void selectItem(String itemCode) {
        currentState.selectProduct(itemCode);
    }
    public void insertMoney(Coins coin) {
        currentState.insertMoney(coin);
    }
    public void dispenseItem() {
        currentState.dispenseProduct();
    }
    public void addMoney(double value){
        balance += value;
    }
    public void dispenseSelectedItem(){
        Item item = inventory.getItem(selectedItemCode);
        if(balance >= item.getPrice()){
            inventory.reduceStock(selectedItemCode);
            balance -= item.getPrice();
            System.out.println("Item dispensed: " + item.getItemName());
            if(balance > 0){
                System.out.println("Returning change: " + balance);
            }
        }
        reset();
        setState(new IdleState(this));
    }
    public void refundBalance(){
        System.out.println("Refunding amount: " + balance);
        reset();
    }
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    public void reset(){
        balance = 0;
        selectedItemCode = null;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSelectedItemCode() {
        return selectedItemCode;
    }

    public void setSelectedItemCode(String selectedItemCode) {
        this.selectedItemCode = selectedItemCode;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }
}
