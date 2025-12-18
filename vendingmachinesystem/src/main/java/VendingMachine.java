import entites.Inventory;
import state.VendingMachineState;

public class VendingMachine {
    private  final static VendingMachine INSTANCE = new VendingMachine();
    private VendingMachineState currentState;
    Inventory inventory = new Inventory();
    private int balance = 0;

    public static VendingMachine getINSTANCE(){
        return INSTANCE;
    }

}
