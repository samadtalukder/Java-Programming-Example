package com.enumtype;

public enum EnumConstructor {
	//this will call enum constructor with one String argument
	RED("wait"),GREEN("go"),YELLOW("slow down");
	private String action;
	
	public String getAction() {
		return this.action;
	}
	// enum constructor - can not be public or protected
	private EnumConstructor(String action) {
		this.action = action;
	}
	/*
	 * Java Enum example with constructor. 
	 * Java Enum can have constructor but it can not
	 * be public or protected
	 *
	 */
}
