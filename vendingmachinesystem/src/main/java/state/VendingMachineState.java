package state;

public abstract class VendingMachineState {
    protected  VendingMachine machine;

    VendingMachineState(VendingMachine machine) {
        this.machine = machine;
    }
    public abstract void insertCoin(int coin);
    public abstract void selectItem(String itemCode);
    public abstract void dispenseItem();
    public abstract void refundAmount();

}
