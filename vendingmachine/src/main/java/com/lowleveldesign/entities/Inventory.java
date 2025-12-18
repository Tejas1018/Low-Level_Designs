package com.lowleveldesign.entities;

import java.util.HashMap;

public class Inventory {

    HashMap<String,Item> itemMap = new HashMap<>();
    HashMap<String,Integer> stockMap = new HashMap<>();

    public void addItem(Item item, int quantity) {
        itemMap.put(item.getItemCode(), item);
        stockMap.put(item.getItemCode(), quantity);
    }
    public  Item getItem(String itemCode) {
        return itemMap.get(itemCode);
    }
    public   int getQuantity(String itemCode) {
        return stockMap.get(itemCode);
    }
    public void reduceStock(String itemCode) {
        int currentStock = stockMap.get(itemCode);
        stockMap.put(itemCode, currentStock - 1);
    }

    public HashMap<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(HashMap<String, Item> itemMap) {
        this.itemMap = itemMap;
    }

    public HashMap<String, Integer> getStockMap() {
        return stockMap;
    }

    public void setStockMap(HashMap<String, Integer> stockMap) {
        this.stockMap = stockMap;
    }
    public boolean isAvailable(String itemCode){
        return stockMap.containsKey(itemCode) && stockMap.get(itemCode) > 0;
    }
}
