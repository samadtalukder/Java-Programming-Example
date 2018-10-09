package com.problems.solution.inventory_system;

public class PickingResult {
	private Location location;
	private Product product;
	private int amount = 0;

	private boolean success = false;
	private String message = "";

	public PickingResult(boolean success, String message, Location location, Product product, int amount) {
		this.success = success;
		this.message = message;

		this.location = location;
		this.product = product;
		this.amount = amount;
	}

	public boolean isSuccessful() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public Location getLocation() {
		return location;
	}

	public Product getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}
}
