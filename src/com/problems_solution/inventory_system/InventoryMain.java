package com.problems_solution.inventory_system;

public class InventoryMain {
	private static Inventory inventoryWarehouse = new Inventory();

	public static void loadInventory() {
		Location loc1 = new Location("STORAGE UNIT 1");
		Location loc2 = new Location("STORAGE UNIT 2");
		Location loc3 = new Location("STORAGE UNIT 3");

		Product p1 = new Product("GAME BOY");
		Product p2 = new Product("AXE SHOWER GEL");
		Product p3 = new Product("SAMSUNG TV");
		Product p4 = new Product("IPHONE");
		Product p5 = new Product("DELL LAPTOP");
		Product p6 = new Product("PENCIL");

		inventoryWarehouse.addLocation(loc1);
		inventoryWarehouse.addLocation(loc2);
		inventoryWarehouse.addLocation(loc3);

		inventoryWarehouse.addProduct(p1, loc1, 20);
		inventoryWarehouse.addProduct(p2, loc2, 60);
		inventoryWarehouse.addProduct(p3, loc3, 10);
		inventoryWarehouse.addProduct(p4, loc1, 50);
		inventoryWarehouse.addProduct(p5, loc2, 30);
		inventoryWarehouse.addProduct(p6, loc1, 1000);
	}
	public static void runTransactions() {
		System.out.println("Inventory at start:");
		inventoryWarehouse.displayInventory();

		RestockingResult restockResult;
		PickingResult pickResult;

		restockResult = inventoryWarehouse.restockProduct("DELL LAPTOP", 25);
		System.out.println(restockResult.getMessage());

		pickResult = inventoryWarehouse.pickProduct("IPHONE7", 15);
		System.out.println(pickResult.getMessage());

		pickResult = inventoryWarehouse.pickProduct("SAMSUNG TV", 15);
		System.out.println(pickResult.getMessage());

		pickResult = inventoryWarehouse.pickProduct("GAME BOY", 5);
		System.out.println(pickResult.getMessage());

		System.out.println("");

		System.out.println("Final inventory:");
		inventoryWarehouse.displayInventory();
	}
	public static void main(String[] args) {
		loadInventory();
		runTransactions();

	}

}
