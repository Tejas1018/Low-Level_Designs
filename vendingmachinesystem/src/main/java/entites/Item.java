package entites;

public class Item {
    private String itemCode;
    private String itemName;
    private double itemPrice;

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemPrice(double price) {
        this.itemPrice = itemPrice;
    }

    public String getItemCode() {
        return this.itemCode;
    }
    public String getItemName() {
        return this.itemName;
    }
    public double getItemPrice() {
        return this.itemPrice;
    }
}
