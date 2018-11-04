package com.problems_solution.inventory_system;

import java.util.Hashtable;
import java.util.Set;

public class Location {
	private String name;
    private Hashtable<String, Integer> amountByProductID = new Hashtable<String, Integer>();

    public Location(String name) {
        this.name = name;
    }

    public void restockProduct(String name, Integer amount) {
        Integer previousAmount = getAmountOfProduct(name);

        amountByProductID.put(name, previousAmount + amount);
    }

    /*
     * returns false if we don't have enough product
     */
    public boolean pickProduct(String name, Integer amount) {
        Integer previousAmount = getAmountOfProduct(name);

        if (previousAmount < amount) {
            // not enough items
            return false;
        }

        amountByProductID.put(name, previousAmount - amount);

        return true;
    }

    public boolean hasProduct(String productId) {
        return amountByProductID.get(productId) != null;
    }

    public Integer getAmountOfProduct(String productId) {
        Integer amount = amountByProductID.get(productId);

        return amount != null ? amount : 0;
    }

    public String getName() {
        return this.name;
    }

    public void displayInventory() {
        Set<String> keys = amountByProductID.keySet();
        for (String productId : keys) {
            Integer amount = amountByProductID.get(productId);

            System.out.println("  " + productId + ": " + amount.toString());
        }
    }
}
