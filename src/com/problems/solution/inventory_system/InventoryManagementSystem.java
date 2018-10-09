package com.problems.solution.inventory_system;

public interface InventoryManagementSystem {
	PickingResult pickProduct(String productId, int amountToPick);

	RestockingResult restockProduct(String productId, int amountToRestock);
}
