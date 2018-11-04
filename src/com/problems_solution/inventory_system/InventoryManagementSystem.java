package com.problems_solution.inventory_system;

public interface InventoryManagementSystem {
	PickingResult pickProduct(String productId, int amountToPick);

	RestockingResult restockProduct(String productId, int amountToRestock);
}
