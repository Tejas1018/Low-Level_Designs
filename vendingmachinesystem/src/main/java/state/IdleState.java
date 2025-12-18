package state;

public class IdleState extends VendingMachineState {
    @Override
    public void insertCoin(int coin) {
        System.out.println("Select the Item first,before inserting coin");
    }

    @Override
    public void selectItem(String itemCode) {

    }

    @Override
    public void dispenseItem() {
        System.out.println("Select the Item first,before dispensing item");
    }

    @Override
    public void refundAmount() {
        System.out.println("Select the Item first,before refunding amount");
    }
}
