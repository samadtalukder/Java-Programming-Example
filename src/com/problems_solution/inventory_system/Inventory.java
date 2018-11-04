package com.problems_solution.inventory_system;

import java.util.Hashtable;
import java.util.Set;

public class Inventory implements InventoryManagementSystem{

	private Hashtable<String, Product> products = new Hashtable<String, Product>();
    private Hashtable<String, Location> locations = new Hashtable<String, Location>();

    public void addLocation(Location location) {
        locations.put(location.getName(), location);
    }

    public void addProduct(Product product, Location location, int amount) {
        products.put(product.getName(), product);
        location.restockProduct(product.getName(), amount);
    }

    /*
     * returns location that has the product when you pass a product ID to it
     */
    public Location getLocationByProductID(String productId) throws Exception {
        Set<String> keys = locations.keySet();
        Location result = null;
        for (String key : keys) {
            Location current = locations.get(key);

            if (current.hasProduct(productId)) {
                if (result == null) {
                    result = current;
                } else {
                    // oh uh, we found the product in two locations, warning the
                    // user
                    throw new Exception("product found in two locations");
                }
            }
        }

        return result;
    }

    public void displayInventory() {
        Set<String> keys = locations.keySet();
        for (String key : keys) {
            Location current = locations.get(key);

            System.out.println(current.getName());
            current.displayInventory();
        }
        System.out.println("");
    }

    @Override
    public PickingResult pickProduct(String productId, int amountToPick) {
        Location loc = null;
        Product product = products.get(productId);

        // transaction data
        boolean transactionSuccess = false;
        String transactionMessage = "";

        try {
            loc = getLocationByProductID(productId);

            if (loc == null) {
                throw new Exception("Product " + productId + " wasn't found in any location");
            }

            int amount = loc.getAmountOfProduct(productId);
            if (amount < amountToPick) {
                throw new Exception("We do not have enough products for this transaction (quantity available: " + amount
                        + "), please restock the product " + productId + "!");
            }

            loc.pickProduct(productId, amountToPick);

            transactionSuccess = true;
            transactionMessage = "We have successfully picked " + amountToPick + " items of " + productId;
        } catch (Exception e) {
            transactionMessage = e.getMessage();
        }

        return new PickingResult(transactionSuccess, transactionMessage, loc, product, amountToPick);
    }

    @Override
    public RestockingResult restockProduct(String productId, int amountToRestock) {
        Location loc = null;
        Product product = products.get(productId);

        // transaction data
        boolean transactionSuccess = false;
        String transactionMessage = "";

        try {
            loc = getLocationByProductID(productId);

            if (loc == null) {
                throw new Exception("Location wasn't found");
            }

            loc.restockProduct(productId, amountToRestock);

            transactionSuccess = true;
            transactionMessage = "We have successfully restocked " + amountToRestock + " items of " + productId;
        } catch (Exception e) {
            transactionMessage = e.getMessage();
        }

        return new RestockingResult(transactionSuccess, transactionMessage, loc, product, amountToRestock);
    }

}
