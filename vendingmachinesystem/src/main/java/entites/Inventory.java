package entites;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String,Item> itemMap = new HashMap<>();
    private Map<String,Integer> stockMap = new HashMap<>();

    public void addItem(String itemCode,Item item,int quantity){
        itemMap.put(itemCode,item);
        stockMap.put(itemCode,quantity);
    }

    public void reduceStock(String itemCode){
        if(stockMap.containsKey(itemCode) && stockMap.get(itemCode) > 0){
            stockMap.put(itemCode,stockMap.get(itemCode) - 1);
        }
        if(stockMap.get(itemCode) == 0) {
            itemMap.remove(itemCode);
        }
    }

    public Item getItem(String itemCode){
        return itemMap.get(itemCode);
    }

}
